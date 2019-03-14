package github.clyoudu.dpinj.interpreter.parser;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import github.clyoudu.dpinj.interpreter.exception.OrafileParseException;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/3/8 10:17
 * @description OraFile
 */
public class OraFile extends Expression {

    private List<Expression> expressions = new ArrayList<>();

    private OraFile(String key) {
        super(key);
    }

    public OraFile(){
        super(null);
    }

    public void addExpression(Expression expression) {
        expressions.add(expression);
    }

    public void addAllExpressions(List<Expression> expressionList) {
        expressions.addAll(expressionList);
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    @Override
    public String toString() {
        return toJson().toJSONString();
    }

    @Override
    public void interpreter(OraFileParserContext context) {
        String key = null;
        context.nextToken();
        while(true){
            String token = context.getCurrentToken();
            if(token == null){
                break;
            }
            String tmp = token.trim();

            if("".equals(tmp)){
                context.skipToken(token);
                continue;
            }else if(key == null && !"(".equals(tmp) && !"=".equals(tmp) && !")".equals(tmp) && !"\n".equals(tmp)) {
                key = tmp;
            }else if(key != null && "=".equals(tmp)){
                context.skipToken(token);
                continue;
            }else if(key != null && !"(".equals(tmp)){
                Expression expression = new SimpleExpression(key, tmp);
                expression.interpreter(context);
                expressions.add(expression);
                key = null;
                continue;
            }else if(key != null && "(".equals(tmp)){
                Expression expression = new CompositeExpression(key);
                expression.interpreter(context);
                expressions.add(expression);
                key = null;
                continue;
            }else if("\n".equals(tmp)){
                context.skipToken(token);
                continue;
            }else{
                throw new OrafileParseException("error token: " + token);
            }

            context.nextToken();
        }
    }

    @Override
    public JSON toJson() {
        JSONObject jsonObject = new JSONObject();
        for (Expression expression : expressions) {
            jsonObject.put(expression.getKey(), expression.toJson());
        }
        return jsonObject;
    }

    @Override
    public String toOraFile() {
        List<String> oraParam = new ArrayList<>();
        for (Expression expression : expressions) {
            oraParam.add(expression.getKey() + "=" + expression.toOraFile());
        }
        return StringUtils.join(oraParam, "\n\n");
    }
}

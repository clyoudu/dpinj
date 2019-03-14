package github.clyoudu.dpinj.interpreter.parser;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import github.clyoudu.dpinj.interpreter.exception.OrafileParseException;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/3/8 10:20
 * @description CompositeExpression
 */
public class CompositeExpression extends Expression {

    private List<Expression> expressions = new ArrayList<>();

    public CompositeExpression(String key) {
        super(key);
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    @Override
    public void interpreter(OraFileParserContext context) {
        Stack<String> tokenStack = new Stack<>();
        String key = null;
        while(true) {
            String token = context.getCurrentToken();
            if(token == null && !tokenStack.isEmpty()){
                throw new OrafileParseException("missing ) ...");
            }

            String tmp = token.trim();
            if("".equals(tmp)){
                context.skipToken(token);
                continue;
            }if(key == null && "(".equals(tmp)){
                tokenStack.push(tmp);
                context.nextToken();
            }else if(!tokenStack.isEmpty() && key == null && !"=".equals(tmp) && !")".equals(tmp)){
                key = tmp;
                context.nextToken();
            }else if(!tokenStack.isEmpty() && key != null && "=".equals(tmp)){
                context.skipToken(token);
                continue;
            }else if(!tokenStack.isEmpty() && key != null && "(".equals(tmp)){
                Expression expression = new CompositeExpression(key);
                expression.interpreter(context);
                expressions.add(expression);
                key = null;
                continue;
            }else if(!tokenStack.isEmpty() && key != null && !"(".equals(tmp)){
                Expression expression = new SimpleExpression(key, tmp);
                expression.interpreter(context);
                expressions.add(expression);
                key = null;
                continue;
            }else if(key == null && ")".equals(tmp)){
                tokenStack.pop();
                String nextToken = context.nextToken();
                while(nextToken != null && "".equals(nextToken.trim())){
                    nextToken = context.nextToken();
                }
            }else{
                throw new OrafileParseException("error token: " + token);
            }

            if(context.getCurrentToken() == null || (tokenStack.isEmpty() && !"(".equals(context.getCurrentToken()))){
                break;
            }
        }
    }

    @Override
    public JSON toJson() {
        JSONArray jsonArray = new JSONArray();
        for (Expression expression : expressions) {
            jsonArray.add(new JSONObject().fluentPut(expression.getKey(), expression.toJson()));
        }
        return jsonArray;
    }

    @Override
    public String toOraFile() {
        List<String> list = new ArrayList<>();
        for (Expression expression : expressions) {
            list.add(expression.getKey() + "=(" + expression.toOraFile() + ")");
        }
        return "(" + StringUtils.join(list, "") + ")";
    }
}

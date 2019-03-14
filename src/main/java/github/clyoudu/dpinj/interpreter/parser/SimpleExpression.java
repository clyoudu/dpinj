package github.clyoudu.dpinj.interpreter.parser;

import com.alibaba.fastjson.JSONArray;
import github.clyoudu.dpinj.interpreter.exception.OrafileParseException;

/**
 * Create by IntelliJ IDEA
 * a=b
 * @author chenlei
 * @dateTime 2019/3/8 10:19
 * @description SimpleExpression
 */
public class SimpleExpression extends Expression {

    private String value;

    private String originValue;

    public SimpleExpression(String key, String value) {
        super(key);
        this.value = value;
        originValue = value.replaceAll("\\[","\\\\(")
                .replaceAll("]","\\\\)").replaceAll("\\|", "\\\\=");
    }

    public String getValue() {
        return value;
    }

    private String getOriginValue(){
        return originValue;
    }

    @Override
    public void interpreter(OraFileParserContext context) {
        //unquote
        if(value.startsWith("'") || value.startsWith("\"") || value.endsWith("'") || value.endsWith("\"")) {
            if((value.startsWith("'") && value.endsWith("'")) || (value.startsWith("\"") && value.endsWith("\""))){
                value = value.substring(1, value.length() - 1);
            }else{
                throw new OrafileParseException("error value: " + originValue);
            }
        }

        //unescape
        value = value.replaceAll("\\\\(.)", "$1");
        context.nextToken();
    }

    @Override
    public JSONArray toJson() {
        return new JSONArray().fluentAdd(originValue);
    }

    @Override
    public String toOraFile() {
        return originValue;
    }

    @Override
    public String toString() {
        return toJson().toJSONString();
    }
}

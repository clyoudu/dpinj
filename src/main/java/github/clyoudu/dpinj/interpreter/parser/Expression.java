package github.clyoudu.dpinj.interpreter.parser;

import com.alibaba.fastjson.JSON;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/3/8 10:11
 * @description Expression
 */
public abstract class Expression {

    protected String key;

    public Expression(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public abstract void interpreter(OraFileParserContext context);

    public abstract JSON toJson();

    public abstract String toOraFile();

}

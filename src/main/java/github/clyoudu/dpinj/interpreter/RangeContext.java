package github.clyoudu.dpinj.interpreter;

import java.util.StringTokenizer;

/**
 * Created by IntelliJ IDEA
 * <p>
 * <p>
 * expression operator expression
 * (expression operator expression)
 * <p>
 * expression ::= left integer ',' integer right
 * integer ::= integer
 * left ::= '['|'('
 * right ::= ']'|')'
 *
 * @author chenlei
 * @date 2019/3/7
 * @time 21:34
 * @desc RangeContext
 */
public class RangeContext {

    private StringTokenizer tokenizer;

    private String currentToken;

    private Range range;

    public RangeContext(String expression) {
        range = new Range();
        tokenizer = new StringTokenizer(expression, "[(,)]", true);
        nextToken();
    }

    public String nextToken() {
        if (tokenizer.hasMoreTokens()) {
            currentToken = tokenizer.nextToken();
        } else {
            currentToken = null;
        }
        return currentToken;
    }

    public String getCurrentToken() {
        return currentToken;
    }

    public Range getRange() {
        return range;
    }

    public void skipToken(String token) {
        if (!token.equals(currentToken)) {
            System.err.println("error：" + currentToken + " interpreter error!");
        }
        nextToken();
    }
}

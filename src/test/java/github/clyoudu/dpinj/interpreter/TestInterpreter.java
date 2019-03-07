package github.clyoudu.dpinj.interpreter;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/7
 * @time 23:06
 * @desc TestInterpreter
 */
public class TestInterpreter {

    @Test
    public void test() {
        RangeContext context = new RangeContext("[3,4]");
        Expression expression = new Expression();
        expression.interpret(context);

        System.out.println();
        Range range = context.getRange();
        System.out.println(range.check(2));
        System.out.println(range.check(3));
        System.out.println(range.check(4));
        System.out.println(range.check(5));
    }

}

package github.clyoudu.dpinj.interpreter;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/7
 * @time 22:51
 * @desc Separator
 */
public class Separator extends AbstractNode {
    @Override
    public void interpret(RangeContext rangeContext) {
        String token = rangeContext.getCurrentToken();
        System.out.println("separator: " + token);
        rangeContext.skipToken(token);
    }
}

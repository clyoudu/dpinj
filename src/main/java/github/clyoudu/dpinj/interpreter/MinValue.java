package github.clyoudu.dpinj.interpreter;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/7
 * @time 22:58
 * @desc MinValue
 */
public class MinValue extends AbstractNode {

    @Override
    public void interpret(RangeContext rangeContext) {
        String minStr = rangeContext.getCurrentToken();
        System.out.println("min: " + minStr);
        rangeContext.getRange().setMin(Integer.parseInt(minStr));
        rangeContext.nextToken();
    }
}

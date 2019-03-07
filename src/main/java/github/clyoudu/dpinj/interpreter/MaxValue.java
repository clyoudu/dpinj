package github.clyoudu.dpinj.interpreter;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/7
 * @time 23:00
 * @desc MaxValue
 */
public class MaxValue extends AbstractNode {
    @Override
    public void interpret(RangeContext rangeContext) {
        String maxStr = rangeContext.getCurrentToken();
        System.out.println("max: " + maxStr);
        rangeContext.getRange().setMax(Integer.parseInt(maxStr));
        rangeContext.nextToken();
    }
}

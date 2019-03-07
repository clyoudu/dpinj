package github.clyoudu.dpinj.interpreter;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/7
 * @time 22:49
 * @desc Right
 */
public class Right extends AbstractNode {
    @Override
    public void interpret(RangeContext rangeContext) {
        String token = rangeContext.getCurrentToken();
        System.out.println("right: " + token);
        switch (token) {
            case "]":
                rangeContext.getRange().setContainsMax(true);
                break;
            case ")":
                rangeContext.getRange().setContainsMax(false);
                break;
            default:
                throw new IllegalArgumentException("error token " + rangeContext.getCurrentToken());
        }
        rangeContext.nextToken();
    }
}

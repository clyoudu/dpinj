package github.clyoudu.dpinj.interpreter;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/7
 * @time 22:44
 * @desc Left
 */
public class Left extends AbstractNode {
    @Override
    public void interpret(RangeContext rangeContext) {
        String token = rangeContext.getCurrentToken();
        System.out.println("left: " + token);
        switch (token) {
            case "[":
                rangeContext.getRange().setContainsMin(true);
                break;
            case "(":
                rangeContext.getRange().setContainsMin(false);
                break;
            default:
                throw new IllegalArgumentException("error token " + rangeContext.getCurrentToken());
        }

        rangeContext.nextToken();
    }
}

package github.clyoudu.dpinj.interpreter;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/7
 * @time 22:31
 * @desc Expression
 */
public class Expression extends AbstractNode {
    private AbstractNode left = new Left();
    private AbstractNode minValue = new MinValue();
    private AbstractNode separator = new Separator();
    private AbstractNode maxValue = new MaxValue();
    private AbstractNode right = new Right();

    @Override
    public void interpret(RangeContext rangeContext) {
        left.interpret(rangeContext);

        minValue.interpret(rangeContext);

        separator.interpret(rangeContext);

        maxValue.interpret(rangeContext);

        right.interpret(rangeContext);

        if(rangeContext.getCurrentToken() != null){
            throw new IllegalArgumentException("error token: " + rangeContext.getCurrentToken());
        }
    }
}

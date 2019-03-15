package github.clyoudu.dpinj.state;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/3/15 17:53
 * @description StartFail
 */
public class StartFail extends State {
    @Override
    public void handle(DeployContext context) {
        if(context.getRetry() < context.getMaxRetry()){
            context.setRetry(context.getRetry() + 1);
            context.setState(new Start());
        }else{
            System.out.println("Start fail...");
        }
    }
}

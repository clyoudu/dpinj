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
        boolean start = true;
        if(!start && context.getRetry() < context.getMaxRetry()){
            context.setRetry(context.getRetry() + 1);
            context.setState(new Start());
        }else{
            System.out.println("Start fail...");
            System.out.println("Send mail to [" + context.getEmail() + "]...");
        }
    }
}

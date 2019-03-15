package github.clyoudu.dpinj.state;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/3/15 17:55
 * @description Start
 */
public class Start extends State {
    @Override
    public void handle(DeployContext context) {
        System.out.println("Start app[" + (context.getRetry() + 1) + "]...");
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
            context.setState(new StartFail());
        }
        context.setState(new StartSuccess());
    }
}

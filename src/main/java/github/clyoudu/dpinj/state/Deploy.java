package github.clyoudu.dpinj.state;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/3/15 17:48
 * @description Deploy
 */
public class Deploy extends State {
    @Override
    public void handle(DeployContext context) {
        System.out.println("Deploy start...");
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
            context.setState(new DeployFail());
        }
        context.setState(new DeploySuccess());
    }
}

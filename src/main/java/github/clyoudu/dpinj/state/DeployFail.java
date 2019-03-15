package github.clyoudu.dpinj.state;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/3/15 17:54
 * @description DeployFail
 */
public class DeployFail extends State {
    @Override
    public void handle(DeployContext context) {
        System.out.println("Deploy fail...");
        System.out.println("Send mail to [" + context.getEmail() + "]...");
    }
}

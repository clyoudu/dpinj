package github.clyoudu.dpinj.state;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/3/15 17:55
 * @description DeploySuccess
 */
public class DeploySuccess extends State {
    @Override
    public void handle(DeployContext context) {
        System.out.println("Deploy success...");
        context.setState(new Start());
    }
}

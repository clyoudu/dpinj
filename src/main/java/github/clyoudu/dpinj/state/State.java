package github.clyoudu.dpinj.state;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/3/15 17:46
 * @description State
 */
public abstract class State {

    public abstract void handle(DeployContext context);

}

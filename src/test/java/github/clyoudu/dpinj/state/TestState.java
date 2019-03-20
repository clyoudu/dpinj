package github.clyoudu.dpinj.state;

import org.junit.Test;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/3/20 16:17
 * @description TestState
 */
public class TestState {

    @Test
    public void test() {
        DeployContext context = new DeployContext();
        context.setState(new Deploy());
    }

}

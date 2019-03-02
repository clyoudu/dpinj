package github.clyoudu.dpinj.proxy;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/2
 * @time 17:18
 * @desc TestProxy
 */
public class TestProxy {

    @Test
    public void test() {
        PermissionProxy proxy = new PermissionProxy(new DeletePermission());
        proxy.execute(new User("Ashe", new HashSet<>(Arrays.asList("update", "delete"))), "target A");

        proxy.execute(new User("Bob", null), "target A");
        /*
        Ashe execute delete on target A...
        Bob has no delete permission...
         */
    }

}

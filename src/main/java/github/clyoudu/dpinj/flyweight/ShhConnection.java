package github.clyoudu.dpinj.flyweight;

import java.util.UUID;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/2
 * @time 15:10
 * @desc ShhConnection
 */
public class ShhConnection extends Connection {

    @Override
    public void connect() {
        System.out.println("Connected by ssh[" + ip + "]...");
    }

    @Override
    public String request(String cmd) {
        System.out.println("Execute [" + cmd + "] by shh...");
        return UUID.randomUUID().toString();
    }

    @Override
    public void shutdown() {
        System.out.println("Shh connection closed...");
    }
}

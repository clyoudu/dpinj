package github.clyoudu.dpinj.flyweight;

import java.util.UUID;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/2
 * @time 15:38
 * @desc TcpConnection
 */
public class TcpConnection extends Connection {
    @Override
    public void connect() {
        System.out.println("Connected by tcp[" + ip + "]...");
    }

    @Override
    public String request(String cmd) {
        System.out.println("Execute [" + cmd + "] by tcp...");
        return UUID.randomUUID().toString();
    }

    @Override
    public void shutdown() {
        System.out.println("Tcp connection closed...");
    }
}

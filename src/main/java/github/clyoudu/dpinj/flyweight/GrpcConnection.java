package github.clyoudu.dpinj.flyweight;

import java.util.UUID;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/2
 * @time 15:37
 * @desc GrpcConnection
 */
public class GrpcConnection extends Connection {
    @Override
    public void connect() {
        System.out.println("Connected by grpc[" + ip + "]...");
    }

    @Override
    public String request(String cmd) {
        System.out.println("Execute [" + cmd + "] by grpc...");
        return UUID.randomUUID().toString();
    }

    @Override
    public void shutdown() {
        System.out.println("Grpc connection closed...");
    }
}

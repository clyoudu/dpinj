package github.clyoudu.dpinj.flyweight;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/2
 * @time 15:20
 * @desc ConnectionFactory
 */
public class ConnectionFactory {

    private static final ConcurrentHashMap<ConnectionType,Connection> CONNECTION_MAP = new ConcurrentHashMap<>();
    static {
        CONNECTION_MAP.put(ConnectionType.SSH, new ShhConnection());
        CONNECTION_MAP.put(ConnectionType.GRPC, new GrpcConnection());
        CONNECTION_MAP.put(ConnectionType.TCP, new TcpConnection());
    }

    public static Connection getConnection(ConnectionType type){
        return CONNECTION_MAP.get(type);
    }

}

package github.clyoudu.dpinj.flayweight;

import github.clyoudu.dpinj.flyweight.Connection;
import github.clyoudu.dpinj.flyweight.ConnectionFactory;
import github.clyoudu.dpinj.flyweight.ConnectionType;
import github.clyoudu.dpinj.flyweight.Connections;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/2
 * @time 15:50
 * @desc TestFlyWeight
 */
public class TestFlyWeight {

    @Test
    public void test(){
        Connection sshConnection = ConnectionFactory.getConnection(ConnectionType.SSH);
        Connection grpcConnection = ConnectionFactory.getConnection(ConnectionType.GRPC);
        Connection tcpConnection = ConnectionFactory.getConnection(ConnectionType.TCP);

        sshConnection.connect();
        sshConnection.request("ssh cmd");
        grpcConnection.connect();
        grpcConnection.request("grpc cmd");
        tcpConnection.connect();
        tcpConnection.request("tcp cmd");

        Connection sshConnection1 = ConnectionFactory.getConnection(ConnectionType.SSH);
        Connection grpcConnection1 = ConnectionFactory.getConnection(ConnectionType.GRPC);
        Connection tcpConnection1 = ConnectionFactory.getConnection(ConnectionType.TCP);
        System.out.println(sshConnection1 == sshConnection);//true
        System.out.println(grpcConnection1 == grpcConnection);//true
        System.out.println(tcpConnection1 == tcpConnection);//true

        Connections connections = new Connections();
        connections.addConnections(Arrays.asList(sshConnection,grpcConnection1,tcpConnection1));
        connections.connect();
        connections.request("ssh cmd or grpc cmd");
        connections.shutdown();

    }

}

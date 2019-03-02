package github.clyoudu.dpinj.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/2
 * @time 15:16
 * @desc Connections
 */
public class Connections extends Connection {

    private List<Connection> connections;

    public Connections() {
        connections = new ArrayList<>();
    }

    public void addConnection(Connection connection){
        connections.add(connection);
    }

    public void addConnections(List<Connection> connectionList){
        connections.addAll(connectionList);
    }

    public void removeConnection(Connection connection){
        connections.remove(connection);
    }

    public void removeConnections(List<Connection> connectionList){
        connections.removeAll(connectionList);
    }

    @Override
    public void connect() {
        connections.forEach(Connection::connect);
    }

    @Override
    public String request(String cmd) {
        StringBuilder sb = new StringBuilder();
        connections.forEach(connection -> sb.append(connection.request(cmd)));
        return sb.toString();
    }

    @Override
    public void shutdown() {
        connections.forEach(Connection::shutdown);
    }
}

package github.clyoudu.dpinj.flyweight;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/2
 * @time 15:08
 * @desc Connection
 */
public abstract class Connection {

    protected static final String ip = "192.168.0.100";

    public abstract void connect();

    public abstract String request(String cmd);

    public abstract void shutdown();

}

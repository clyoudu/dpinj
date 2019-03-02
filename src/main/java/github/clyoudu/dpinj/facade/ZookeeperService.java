package github.clyoudu.dpinj.facade;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/2
 * @time 14:16
 * @desc ZookeeperService
 */
public class ZookeeperService implements Controlable {

    @Override
    public void start() {
        System.out.println("Zookeeper server started...");
    }

    @Override
    public void shutdown() {
        System.out.println("Zookeeper server has been shut down...");
    }

}

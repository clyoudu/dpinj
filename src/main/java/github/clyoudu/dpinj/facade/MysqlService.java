package github.clyoudu.dpinj.facade;


/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/2
 * @time 14:11
 * @desc MysqlService
 */
public class MysqlService implements Controlable {

    @Override
    public void start() {
        System.out.println("MySQL server started...");
    }

    @Override
    public void shutdown() {
        System.out.println("MySQL server has been shut down...");
    }
}

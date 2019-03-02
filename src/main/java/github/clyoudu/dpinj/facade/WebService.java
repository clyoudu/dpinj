package github.clyoudu.dpinj.facade;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/2
 * @time 14:15
 * @desc WebService
 */
public class WebService implements Controlable {

    @Override
    public void start() {
        System.out.println("Web server started...");
    }

    @Override
    public void shutdown() {
        System.out.println("Web server has been shut down...");
    }
}

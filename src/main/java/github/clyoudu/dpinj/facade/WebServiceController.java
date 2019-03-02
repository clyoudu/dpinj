package github.clyoudu.dpinj.facade;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/2
 * @time 14:18
 * @desc WebServiceController
 */
public class WebServiceController extends AbstractController {

    private WebService webService = new WebService();

    private MysqlService mysqlService = new MysqlService();

    @Override
    void start() {
        mysqlService.start();
        webService.start();
        System.out.println();
    }

    @Override
    void shutdown() {
        webService.shutdown();
        mysqlService.shutdown();
        System.out.println();
    }
}

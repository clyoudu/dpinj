package github.clyoudu.dpinj.facade;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/2
 * @time 14:24
 * @desc TestFacade
 */
public class TestFacade {

    @Test
    public void test() {
        new WebServiceController().start();
        new WebServiceController().shutdown();

        new KafkaServiceController().start();
        new KafkaServiceController().shutdown();
    }
    /*
    MySQL server started...
    Web server started...

    Web server has been shut down...
    MySQL server has been shut down...

    Zookeeper server started...
    Kafka server started...

    Kafka server has been shut down...
    Zookeeper server has been shut down...

     */

}

package github.clyoudu.dpinj.facade;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/2
 * @time 14:23
 * @desc KafkaServiceController
 */
public class KafkaServiceController extends AbstractController {

    private KafkaService kafkaService = new KafkaService();

    private ZookeeperService zookeeperService = new ZookeeperService();

    @Override
    void start() {
        zookeeperService.start();
        kafkaService.start();
        System.out.println();
    }

    @Override
    void shutdown() {
        kafkaService.shutdown();
        zookeeperService.shutdown();
        System.out.println();
    }
}

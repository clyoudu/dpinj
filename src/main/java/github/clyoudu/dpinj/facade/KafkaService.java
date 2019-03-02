package github.clyoudu.dpinj.facade;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/2
 * @time 14:17
 * @desc KafkaService
 */
public class KafkaService implements Controlable {

    @Override
    public void start() {
        System.out.println("Kafka server started...");
    }

    @Override
    public void shutdown() {
        System.out.println("Kafka server has been shut down...");
    }

}

package github.clyoudu.dpinj.observer;

import com.cronutils.model.definition.CronDefinition;
import com.cronutils.model.definition.CronDefinitionBuilder;
import com.cronutils.model.time.ExecutionTime;
import com.cronutils.parser.CronParser;
import github.clyoudu.dpinj.observer.util.PrintUtil;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Observable;
import java.util.concurrent.ConcurrentLinkedDeque;

import static com.cronutils.model.CronType.QUARTZ;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/3/14 17:02
 * @description Trigger
 */
public class Trigger extends Observable {

    private static CronDefinition cronDefinition = CronDefinitionBuilder.instanceDefinitionFor(QUARTZ);

    private static CronParser parser = new CronParser(cronDefinition);

    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    protected String cronExpression;

    private ExecutionTime executionTime;

    private ConcurrentLinkedDeque<ZonedDateTime> executionTimeQueue = new ConcurrentLinkedDeque<>();

    public Trigger(String cronExpression) {
        this.cronExpression = cronExpression;
        executionTime = ExecutionTime.forCron(parser.parse(cronExpression));
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public Trigger setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }

    public synchronized void trigger() {
        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime preTime = now;
        if(executionTimeQueue.isEmpty()){
            while (executionTimeQueue.size() < 10){
                ZonedDateTime next = executionTime.nextExecution(preTime).get();
                preTime = next;
                executionTimeQueue.offerLast(next);
            }
        }else if(executionTimeQueue.size() < 10) {
            preTime = executionTimeQueue.peekLast();
            while (executionTimeQueue.size() < 10){
                ZonedDateTime next = executionTime.nextExecution(preTime).get();
                preTime = next;
                executionTimeQueue.offerLast(next);
            }
        }

        while (executionTimeQueue.peekFirst().isBefore(now) || executionTimeQueue.peekFirst().isEqual(now)){
            setChanged();
            notifyObservers(executionTimeQueue.pollFirst());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutionTime executionTime = ExecutionTime.forCron(parser.parse("0/5 * * * * ?"));
        for (int i = 0; i < 50; i++) {
            Thread.sleep(500L);
            PrintUtil.println(executionTime.nextExecution(ZonedDateTime.now()).get().format(DATE_FORMAT));
        }
    }
}

package github.clyoudu.dpinj.observer;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/3/14 17:15
 * @description Scheduler
 */
public class Scheduler {

    private Set<Trigger> triggerSet;

    private ScheduledExecutorService scheduledExecutorService;

    public Scheduler(int poolSize) {
        scheduledExecutorService = Executors.newScheduledThreadPool(poolSize +1);
        triggerSet= new HashSet<>();
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            for (Trigger trigger : triggerSet) {
                scheduledExecutorService.submit(trigger::trigger);
            }
        },0, 1, TimeUnit.SECONDS);
    }

    public void schedule(Trigger trigger, Job job) {
        if(triggerSet.contains(trigger)) {
            trigger.addObserver(job);
        }else {
            triggerSet.add(trigger);
            trigger.addObserver(job);
        }
    }

}

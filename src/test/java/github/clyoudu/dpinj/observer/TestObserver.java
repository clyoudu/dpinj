package github.clyoudu.dpinj.observer;

import org.junit.Test;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/3/15 9:28
 * @description TestObserver
 */
public class TestObserver {

    private static final Object lock = new Object();

    @Test
    public void test() throws InterruptedException {
        Scheduler scheduler = new Scheduler(10);
        Trigger trigger1 = new Trigger("0/5 * * * * ?");
        Trigger trigger2 = new Trigger("0 0/1 * * * ?");
        scheduler.schedule(trigger1, new Job1());
        scheduler.schedule(trigger2, new Job2());

        synchronized (lock) {
            lock.wait();
        }
    }

}

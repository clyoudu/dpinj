package github.clyoudu.dpinj.singleton;

import org.junit.Test;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/2/19 16:53
 * @description TestSingleton
 */
public class TestSingleton {

    @Test
    public void test() throws InterruptedException {
        ApplicationCounter applicationCounter = ApplicationCounter.getApplicationCounter();
        ApplicationCounter applicationCounter1 = ApplicationCounter.getApplicationCounter();
        assert applicationCounter == applicationCounter1;
        for (int i = 0; i < 100; i++) {
            new Thread(applicationCounter::increase).start();
        }
        Thread.sleep(100L);
        System.out.println(applicationCounter.get());
    }

    @Test
    public void test1() throws InterruptedException {
        ApplicationCounter1 applicationCounter1 = ApplicationCounter1.getApplicationCounter();
        ApplicationCounter1 applicationCounter11 = ApplicationCounter1.getApplicationCounter();
        assert applicationCounter1 == applicationCounter11;
        for (int i = 0; i < 100; i++) {
            new Thread(applicationCounter1::increase).start();
        }
        Thread.sleep(100L);
        System.out.println(applicationCounter1.get());
    }

    @Test
    public void test3() throws InterruptedException {
        ApplicationCounter3 applicationCounter3 = ApplicationCounter3.getApplicationCounter();
        ApplicationCounter3 applicationCounter31 = ApplicationCounter3.getApplicationCounter();
        assert applicationCounter3 == applicationCounter31;
        for (int i = 0; i < 100; i++) {
            new Thread(applicationCounter3::increase).start();
        }
        Thread.sleep(100L);
        System.out.println(applicationCounter3.get());
    }

}

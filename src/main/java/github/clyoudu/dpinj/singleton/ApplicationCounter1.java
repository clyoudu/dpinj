package github.clyoudu.dpinj.singleton;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/2/19 17:21
 * @description ApplicationCounter1
 */
public class ApplicationCounter1 {

    private AtomicInteger counter = new AtomicInteger(0);

    private static ApplicationCounter1 applicationCounter1 = new ApplicationCounter1();

    public Integer increase(){
        return applicationCounter1.counter.addAndGet(1);
    }

    public Integer get(){
        return applicationCounter1.counter.get();
    }

    public static ApplicationCounter1 getApplicationCounter(){
        return applicationCounter1;
    }

}

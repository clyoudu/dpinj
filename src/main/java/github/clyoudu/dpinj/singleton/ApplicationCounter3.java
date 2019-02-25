package github.clyoudu.dpinj.singleton;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/2/19 18:00
 * @description ApplicationCounter3
 */
public class ApplicationCounter3 {

    private AtomicInteger counter = new AtomicInteger(0);

    private static class ApplicationCounterHolder{
        private final static ApplicationCounter3 applicationCounter3 = new ApplicationCounter3();
    }

    public Integer increase(){
        return ApplicationCounterHolder.applicationCounter3.counter.addAndGet(1);
    }

    public Integer get(){
        return ApplicationCounterHolder.applicationCounter3.counter.get();
    }

    public static synchronized ApplicationCounter3 getApplicationCounter(){
        return ApplicationCounterHolder.applicationCounter3;
    }
    
}

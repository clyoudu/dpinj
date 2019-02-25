package github.clyoudu.dpinj.singleton;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/2/19 16:36
 * @description ApplicationCounter
 */
public class ApplicationCounter {

    private AtomicInteger counter = new AtomicInteger(0);

    private static ApplicationCounter applicationCounter;

    public Integer increase(){
        return applicationCounter.counter.addAndGet(1);
    }

    public Integer get(){
        return applicationCounter.counter.get();
    }

    public static ApplicationCounter getApplicationCounter(){
        if(applicationCounter == null){
            applicationCounter = new ApplicationCounter();
        }

        return applicationCounter;
    }

}

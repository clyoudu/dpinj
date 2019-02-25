package github.clyoudu.dpinj.singleton;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/2/19 17:27
 * @description ApplicationCounter2
 */
public class ApplicationCounter2 {

    private AtomicInteger counter = new AtomicInteger(0);

    private static ApplicationCounter2 applicationCounter2;

    public Integer increase(){
        return applicationCounter2.counter.addAndGet(1);
    }

    public Integer get(){
        return applicationCounter2.counter.get();
    }

    public static synchronized ApplicationCounter2 getApplicationCounter(){
        if(applicationCounter2 == null){
            applicationCounter2 = new ApplicationCounter2();
        }

        return applicationCounter2;
    }
    
}

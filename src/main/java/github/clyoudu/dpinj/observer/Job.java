package github.clyoudu.dpinj.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/3/14 17:19
 * @description Job
 */
public abstract class Job implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        execute(arg);
    }

    public abstract void execute(Object arg);
}

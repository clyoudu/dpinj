package github.clyoudu.dpinj.observer;

import github.clyoudu.dpinj.observer.util.PrintUtil;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/3/15 9:27
 * @description Job2
 */
public class Job2 extends Job {
    @Override
    public void execute(Object arg) {
        PrintUtil.println("Job2 at [" + arg + "] start...");
    }
}

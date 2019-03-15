package github.clyoudu.dpinj.observer;

import github.clyoudu.dpinj.observer.util.PrintUtil;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/3/15 9:25
 * @description Job1
 */
public class Job1 extends Job {
    @Override
    public void execute(Object arg) {
        PrintUtil.println("Job1 at [" + arg + "] start...");
    }
}

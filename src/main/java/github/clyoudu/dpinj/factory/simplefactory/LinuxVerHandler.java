package github.clyoudu.dpinj.factory.simplefactory;

import java.util.concurrent.TimeUnit;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/28 11:31
 * @description LinuxVerHandler
 */
public class LinuxVerHandler extends AbstractHostVerHandler {
    @Override
    protected String version() {
        try {
            Process process = Runtime.getRuntime().exec("cat /proc/version");
            process.waitFor(TIMEOUT, TimeUnit.MILLISECONDS);
            return readInputStream(process.getInputStream());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

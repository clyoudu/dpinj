package github.clyoudu.dpinj.factory.abstractfactory.factory;

import github.clyoudu.dpinj.factory.abstractfactory.jdk.AbstractJdk;
import github.clyoudu.dpinj.factory.abstractfactory.jdk.DefaultJdk;
import github.clyoudu.dpinj.factory.abstractfactory.logshipper.AbstractLogShipper;
import github.clyoudu.dpinj.factory.abstractfactory.logshipper.FilebeatLogShipper;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/28 16:33
 * @description LinuxInitFactory
 */
public class LinuxInitFactory extends AbstractInitFactory {
    @Override
    public AbstractJdk createJdk() {
        return new DefaultJdk();
    }

    @Override
    public AbstractLogShipper createLogShipper() {
        return new FilebeatLogShipper();
    }
}

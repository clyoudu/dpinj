package github.clyoudu.dpinj.factory.abstractfactory.factory;

import github.clyoudu.dpinj.factory.abstractfactory.jdk.AbstractJdk;
import github.clyoudu.dpinj.factory.abstractfactory.jdk.IbmJdk;
import github.clyoudu.dpinj.factory.abstractfactory.logshipper.AbstractLogShipper;
import github.clyoudu.dpinj.factory.abstractfactory.logshipper.LogstashLogShipper;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/28 16:31
 * @description AixInitFactory
 */
public class AixInitFactory extends AbstractInitFactory {
    @Override
    public AbstractJdk createJdk() {
        return new IbmJdk();
    }

    @Override
    public AbstractLogShipper createLogShipper() {
        return new LogstashLogShipper();
    }
}

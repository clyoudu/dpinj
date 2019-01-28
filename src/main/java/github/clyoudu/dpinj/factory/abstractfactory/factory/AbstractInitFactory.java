package github.clyoudu.dpinj.factory.abstractfactory.factory;

import github.clyoudu.dpinj.factory.abstractfactory.jdk.AbstractJdk;
import github.clyoudu.dpinj.factory.abstractfactory.logshipper.AbstractLogShipper;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/28 16:30
 * @description AbstractInitFactory
 */
public abstract class AbstractInitFactory {

    public abstract AbstractJdk createJdk();
    public abstract AbstractLogShipper createLogShipper();

}

package github.clyoudu.dpinj.factory.abstractfactory.logshipper;

import github.clyoudu.dpinj.factory.abstractfactory.entity.HostConfig;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/28 16:22
 * @description AbstractLogShipper
 */
public abstract class AbstractLogShipper {

    public abstract void install(HostConfig hostConfig);

    public abstract void config(HostConfig hostConfig);

    public abstract void start(HostConfig hostConfig);

}

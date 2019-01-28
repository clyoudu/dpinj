package github.clyoudu.dpinj.factory.abstractfactory.jdk;

import github.clyoudu.dpinj.factory.abstractfactory.entity.HostConfig;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/28 16:15
 * @description AbstractJdk
 */
public abstract class AbstractJdk {

    public abstract void install(HostConfig hostConfig);

    public abstract void start(HostConfig hostConfig);

}

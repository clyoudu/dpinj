package github.clyoudu.dpinj.factory.abstractfactory.jdk;

import github.clyoudu.dpinj.factory.abstractfactory.entity.HostConfig;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/28 16:21
 * @description IbmJdk
 */
public class IbmJdk extends AbstractJdk {
    @Override
    public void install(HostConfig hostConfig) {
        System.out.println("install ibm jdk on host [" + hostConfig.getIp() + "]");
    }

    @Override
    public void start(HostConfig hostConfig) {
        System.out.println("start ibm jdk on host [" + hostConfig.getIp() + "]");
    }
}

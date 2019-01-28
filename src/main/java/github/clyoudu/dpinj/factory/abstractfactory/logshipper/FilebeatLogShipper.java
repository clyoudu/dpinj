package github.clyoudu.dpinj.factory.abstractfactory.logshipper;

import github.clyoudu.dpinj.factory.abstractfactory.entity.HostConfig;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/28 16:24
 * @description FilebeatLogShipper
 */
public class FilebeatLogShipper extends AbstractLogShipper {
    @Override
    public void install(HostConfig hostConfig) {
        System.out.println("install filebeat on host [" + hostConfig.getIp() + "]");
    }

    @Override
    public void config(HostConfig hostConfig) {
        System.out.println("config filebeat on host [" + hostConfig.getIp() + "]");
    }

    @Override
    public void start(HostConfig hostConfig) {
        System.out.println("start filebeat on host [" + hostConfig.getIp() + "]");
    }
}

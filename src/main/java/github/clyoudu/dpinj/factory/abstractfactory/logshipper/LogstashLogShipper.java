package github.clyoudu.dpinj.factory.abstractfactory.logshipper;

import github.clyoudu.dpinj.factory.abstractfactory.entity.HostConfig;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/28 16:25
 * @description LogstashLogShipper
 */
public class LogstashLogShipper extends AbstractLogShipper {
    @Override
    public void install(HostConfig hostConfig) {
        System.out.println("install logstash on host [" + hostConfig.getIp() + "]");
    }

    @Override
    public void config(HostConfig hostConfig) {
        System.out.println("config logstash on host [" + hostConfig.getIp() + "]");
    }

    @Override
    public void start(HostConfig hostConfig) {
        System.out.println("start logstash on host [" + hostConfig.getIp() + "]");
    }
}

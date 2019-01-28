package github.clyoudu.dpinj.factory.abstractfactory;

import github.clyoudu.dpinj.factory.abstractfactory.entity.HostConfig;
import github.clyoudu.dpinj.factory.abstractfactory.factory.AbstractInitFactory;
import github.clyoudu.dpinj.factory.abstractfactory.factory.AixInitFactory;
import github.clyoudu.dpinj.factory.abstractfactory.factory.LinuxInitFactory;
import github.clyoudu.dpinj.factory.abstractfactory.jdk.AbstractJdk;
import github.clyoudu.dpinj.factory.abstractfactory.logshipper.AbstractLogShipper;
import org.junit.Test;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/28 16:36
 * @description TestAbstractFactory
 */
public class TestAbstractFactory {

    @Test
    public void test(){
        AixInitFactory aixInitFactory = new AixInitFactory();
        LinuxInitFactory linuxInitFactory = new LinuxInitFactory();

        HostConfig hostConfig = new HostConfig.HostConfigBuilder()
                .ip("192.168.0.9")
                .username("root")
                .password("root")
                .port(22)
                .build();
        init(aixInitFactory, hostConfig);
        System.out.println("\n----------------------------------------------\n");
        init(linuxInitFactory, hostConfig);
    }

    private void init(AbstractInitFactory factory, HostConfig hostConfig){
        AbstractJdk jdk = factory.createJdk();
        AbstractLogShipper logShipper = factory.createLogShipper();

        jdk.install(hostConfig);
        jdk.start(hostConfig);

        logShipper.install(hostConfig);
        logShipper.config(hostConfig);
        logShipper.start(hostConfig);
    }

}

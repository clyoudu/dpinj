package github.clyoudu.dpinj.factory.simplefactory;

import org.junit.Test;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/28 11:42
 * @description TestSimpleFactory
 */
public class TestSimpleFactory {

    @Test
    public void test(){
        String osName = System.getProperty("os.name").toLowerCase();
        String osType = null;
        if(osName.contains("windows")){
            osType = "Windows";
        }else if(osName.contains("linux")){
            osType = "Linux";
        }
        AbstractHostVerHandler hostVerHandler = HostVerFactory.getVerHandler(osType);
        System.out.println(hostVerHandler.getVersion());
    }

}

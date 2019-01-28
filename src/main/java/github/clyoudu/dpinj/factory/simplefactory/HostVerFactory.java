package github.clyoudu.dpinj.factory.simplefactory;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/28 11:39
 * @description HostVerFactory
 */
public class HostVerFactory {

    public static AbstractHostVerHandler getVerHandler(String osType){
        if("Windows".equalsIgnoreCase(osType)){
            return new WinVerHandler();
        }else if("Linux".equalsIgnoreCase(osType)){
            return new LinuxVerHandler();
        }else{
            throw new IllegalArgumentException("Unsupported os type: " + osType);
        }
    }

}

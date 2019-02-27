package github.clyoudu.dpinj.adapter.defaultadapter;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/2/26 17:25
 * @description UsbTypeCAdapter
 */
public class UsbTypeCAdapter extends AbstractUsbAdapter {
    @Override
    public void chargeTypeC() {
        System.out.println("Charging by Type-C interface...");
    }
}

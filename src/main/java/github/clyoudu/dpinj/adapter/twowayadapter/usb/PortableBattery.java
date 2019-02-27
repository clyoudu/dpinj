package github.clyoudu.dpinj.adapter.twowayadapter.usb;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/2/26 16:41
 * @description PortableBattery
 */
public class PortableBattery implements Usb {
    @Override
    public void chargePhone() {
        System.out.println("Connected to Portable Battery USB interface...");
    }
}

package github.clyoudu.dpinj.adapter.twowayadapter.usb;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/2/26 16:40
 * @description Computer
 */
public class Computer implements Usb {
    @Override
    public void chargePhone() {
        System.out.println("Connected to Computer USB interface...");
    }
}

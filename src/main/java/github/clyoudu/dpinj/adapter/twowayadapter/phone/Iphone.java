package github.clyoudu.dpinj.adapter.twowayadapter.phone;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/2/26 16:43
 * @description Iphone
 */
public class Iphone implements Phone {
    @Override
    public void chargeUsb() {
        System.out.println("Connected to Iphone Lightning interface...");
    }
}

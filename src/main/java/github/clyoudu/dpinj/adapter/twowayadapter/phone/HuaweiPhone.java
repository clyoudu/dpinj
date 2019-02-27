package github.clyoudu.dpinj.adapter.twowayadapter.phone;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/2/26 16:42
 * @description HuaweiPhone
 */
public class HuaweiPhone implements Phone {
    @Override
    public void chargeUsb() {
        System.out.println("Connected to Huawei Typ-C interface...");
    }
}

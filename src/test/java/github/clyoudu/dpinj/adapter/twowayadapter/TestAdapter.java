package github.clyoudu.dpinj.adapter.twowayadapter;

import github.clyoudu.dpinj.adapter.twowayadapter.adapter.UsbPhoneAdapter;
import github.clyoudu.dpinj.adapter.twowayadapter.phone.HuaweiPhone;
import github.clyoudu.dpinj.adapter.twowayadapter.phone.Phone;
import github.clyoudu.dpinj.adapter.twowayadapter.usb.Computer;
import github.clyoudu.dpinj.adapter.twowayadapter.usb.Usb;
import org.junit.Test;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/2/26 17:10
 * @description TestAdapter
 */
public class TestAdapter {

    @Test
    public void test(){
        Usb usb = new UsbPhoneAdapter(new Computer(), new HuaweiPhone());
        usb.chargePhone();

        Phone phone = new UsbPhoneAdapter(new Computer(), new HuaweiPhone());
        phone.chargeUsb();
    }

}

package github.clyoudu.dpinj.adapter.twowayadapter.adapter;

import github.clyoudu.dpinj.adapter.twowayadapter.phone.Phone;
import github.clyoudu.dpinj.adapter.twowayadapter.usb.Usb;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/2/26 16:44
 * @description UsbPhoneAdapter
 */
public class UsbPhoneAdapter implements Usb, Phone {

    private Usb usb;

    private Phone phone;

    public UsbPhoneAdapter(Usb usb, Phone phone) {
        this.usb = usb;
        this.phone = phone;
    }

    @Override
    public void chargeUsb() {
        phone.chargeUsb();
    }

    @Override
    public void chargePhone() {
        usb.chargePhone();
    }
}

package github.clyoudu.dpinj.adapter.classadpter.usbinterface;

import github.clyoudu.dpinj.adapter.classadpter.phoneinterface.TypeCPhone;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/2/26 16:09
 * @description UsbPhoneAdapter
 */
public class UsbTypeCAdapter extends TypeCPhone implements Usb {

    @Override
    public void chargePhone() {
        charge();
    }
}

package github.clyoudu.dpinj.adapter.classadpter.usbinterface;

import github.clyoudu.dpinj.adapter.classadpter.phoneinterface.LightningPhone;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/2/26 16:12
 * @description UsbLightningAdapter
 */
public class UsbLightningAdapter extends LightningPhone implements Usb {
    @Override
    public void chargePhone() {
        charge();
    }
}

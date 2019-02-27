package github.clyoudu.dpinj.adapter.objectadapter.usbinterface;

import github.clyoudu.dpinj.adapter.objectadapter.phoneinterface.LightningPhone;
import github.clyoudu.dpinj.adapter.objectadapter.phoneinterface.TypeCPhone;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/2/26 15:13
 * @description UsbAdapter
 */
public class UsbAdapter implements Usb {

    private LightningPhone lightningPhone = new LightningPhone();
    private TypeCPhone typeCPhone = new TypeCPhone();

    @Override
    public void chargeLightning() {
        lightningPhone.charge();
    }

    @Override
    public void chargeTypeC() {
        typeCPhone.charge();
    }
}

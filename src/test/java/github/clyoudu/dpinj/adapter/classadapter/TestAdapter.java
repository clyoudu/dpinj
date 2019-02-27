package github.clyoudu.dpinj.adapter.classadapter;

import github.clyoudu.dpinj.adapter.classadpter.usbinterface.Usb;
import github.clyoudu.dpinj.adapter.classadpter.usbinterface.UsbLightningAdapter;
import github.clyoudu.dpinj.adapter.classadpter.usbinterface.UsbTypeCAdapter;
import org.junit.Test;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/2/26 16:27
 * @description TestAdapter
 */
public class TestAdapter {

    @Test
    public void test(){
        Usb usbLightningAdapter = new UsbLightningAdapter();
        Usb usbTypeCAdapter = new UsbTypeCAdapter();

        usbLightningAdapter.chargePhone();
        usbTypeCAdapter.chargePhone();
    }

}

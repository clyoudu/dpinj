package github.clyoudu.dpinj.adapter.objectadapter;

import github.clyoudu.dpinj.adapter.objectadapter.usbinterface.Usb;
import github.clyoudu.dpinj.adapter.objectadapter.usbinterface.UsbAdapter;
import org.junit.Test;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/2/26 15:50
 * @description TestAdapter
 */
public class TestAdapter {

    @Test
    public void test(){
        Usb usb = new UsbAdapter();
        usb.chargeLightning();
        usb.chargeTypeC();
    }
    /*
     Connected to Iphone Lightning interface...
     Connected to Huawei Type-C interface...
     */
}

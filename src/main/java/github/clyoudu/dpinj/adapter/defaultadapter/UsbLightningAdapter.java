package github.clyoudu.dpinj.adapter.defaultadapter;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/2/26 17:24
 * @description UsbLightningAdapter
 */
public class UsbLightningAdapter extends AbstractUsbAdapter {

    @Override
    public void chargeLightning() {
        System.out.println("Charging by Lightning interface...");
    }
}

package github.clyoudu.dpinj.adapter.defaultadapter;

import org.junit.Test;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/2/26 17:26
 * @description TestAdapter
 */
public class TestAdapter {

    @Test
    public void test(){
        new UsbLightningAdapter().chargeLightning();
        new UsbTypeCAdapter().chargeTypeC();
    }

}

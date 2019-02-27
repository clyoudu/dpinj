package github.clyoudu.dpinj.adapter.classadpter.phoneinterface;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/2/26 15:08
 * @description LightningPhone
 */
public class LightningPhone implements Phone {
    @Override
    public void charge() {
        System.out.println("Connected to Iphone Lightning interface...");
    }
}

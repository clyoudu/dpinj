package github.clyoudu.dpinj.adapter.objectadapter.phoneinterface;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/2/26 15:06
 * @description TypeCPhone
 */
public class TypeCPhone implements Phone {
    @Override
    public void charge() {
        System.out.println("Connected to Huawei Type-C interface...");
    }
}

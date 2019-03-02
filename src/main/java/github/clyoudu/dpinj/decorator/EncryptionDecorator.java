package github.clyoudu.dpinj.decorator;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/1
 * @time 23:09
 * @desc EncryptionDecorator
 */
public abstract class EncryptionDecorator implements Encryption {

    protected Encryption encryption;

    public EncryptionDecorator(Encryption encryption){
        this.encryption = encryption;
    }

    @Override
    public String encode(String s) {
        return encryption.encode(s);
    }

    @Override
    public String decode(String s) {
        return encryption.decode(s);
    }
}

package github.clyoudu.dpinj.decorator;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/1
 * @time 23:12
 * @desc Base64Decorator
 */
public class Base64Decorator extends EncryptionDecorator {

    public Base64Decorator(Encryption encryption) {
        super(encryption);
    }

    @Override
    public String encode(String s) {
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(encryption.encode(s).getBytes());
    }

    @Override
    public String decode(String s) {
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            return encryption.decode(new String(decoder.decodeBuffer(s)));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

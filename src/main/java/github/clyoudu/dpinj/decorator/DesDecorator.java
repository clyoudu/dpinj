package github.clyoudu.dpinj.decorator;

import javax.crypto.*;
import javax.crypto.spec.DESKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/1
 * @time 23:14
 * @desc DesDecorator
 */
public class DesDecorator extends EncryptionDecorator {

    private static final String password = "9588888888880288";

    public DesDecorator(Encryption encryption) {
        super(encryption);
    }

    @Override
    public String encode(String s) {
        try {
            SecureRandom random = new SecureRandom();

            DESKeySpec desKey = new DESKeySpec(password.getBytes());
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey secureKey = keyFactory.generateSecret(desKey);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.ENCRYPT_MODE, secureKey, random);
            return DatatypeConverter.printHexBinary(cipher.doFinal(encryption.encode(s).getBytes("utf-8")));

        } catch (NoSuchAlgorithmException | InvalidKeyException | BadPaddingException | NoSuchPaddingException | InvalidKeySpecException | IllegalBlockSizeException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String decode(String s) {
        try {
            SecureRandom random = new SecureRandom();
            DESKeySpec desKey = new DESKeySpec(password.getBytes());
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey secureKey = keyFactory.generateSecret(desKey);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.DECRYPT_MODE, secureKey, random);
            return encryption.decode(new String(cipher.doFinal(DatatypeConverter.parseHexBinary(s))));
        } catch (NoSuchAlgorithmException | InvalidKeyException | BadPaddingException | NoSuchPaddingException | IllegalBlockSizeException | InvalidKeySpecException e) {
            e.printStackTrace();
        }
        return null;
    }
}

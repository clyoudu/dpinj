package github.clyoudu.dpinj.decorator;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/1
 * @time 22:36
 * @desc TestDecorator
 */
public class TestDecorator {

    @Test
    public void test() {
        Encryption encryptionDefault = new EncryptionDefault();
        System.out.println(encryptionDefault.encode("123"));//ONM

        AesDecorator aesDecorator = new AesDecorator(encryptionDefault);
        System.out.println(aesDecorator.encode("123"));//kc+R5gyXM4NJ/pe7PtWWEw==
        System.out.println(aesDecorator.decode("kc+R5gyXM4NJ/pe7PtWWEw=="));//123

        Base64Decorator base64Decorator = new Base64Decorator(encryptionDefault);
        System.out.println(base64Decorator.encode("123"));//T05N
        System.out.println(base64Decorator.decode("T05N"));//123

        DesDecorator desDecorator = new DesDecorator(encryptionDefault);
        System.out.println(desDecorator.encode("123"));//1D059D1AE2A2C6E1
        System.out.println(desDecorator.decode("1D059D1AE2A2C6E1"));//123

        DesDecorator desDecorator1 = new DesDecorator(new AesDecorator(new Base64Decorator(encryptionDefault)));
        System.out.println(desDecorator1.encode("123"));//BEED6F244E2241FC23402F604BF6DB4F93BB55C75500C11F50A40173C455AEF1
        System.out.println(desDecorator1.decode("BEED6F244E2241FC23402F604BF6DB4F93BB55C75500C11F50A40173C455AEF1"));//123
    }

}

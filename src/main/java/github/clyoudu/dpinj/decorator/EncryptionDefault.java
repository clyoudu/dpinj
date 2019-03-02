package github.clyoudu.dpinj.decorator;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/2
 * @time 0:06
 * @desc EncryptionDefault
 */
public class EncryptionDefault implements Encryption {

    @Override
    public String encode(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append((char)(128 - s.charAt(i)));
        }
        return sb.toString();
    }

    @Override
    public String decode(String s) {
        return encode(s);
    }

    public static void main(String[] args) {
        System.out.println(new EncryptionDefault().encode("123"));
        System.out.println(new EncryptionDefault().decode("ONM"));
    }
}

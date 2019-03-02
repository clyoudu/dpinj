package github.clyoudu.dpinj.decorator;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/1
 * @time 23:07
 * @desc Encryption
 */
public interface Encryption {

    String encode(String s);
    String decode(String s);

}

package github.clyoudu.dpinj.prototype;

import java.io.IOException;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/2/25 11:32
 * @description Config
 */
public interface Config {

    default Config cloneConfig() throws IOException, ClassNotFoundException {
        return CopyUtil.deepCopy(this);
    }

}

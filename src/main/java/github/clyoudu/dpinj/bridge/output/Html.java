package github.clyoudu.dpinj.bridge.output;

import java.util.List;
import java.util.Map;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/3/1 15:23
 * @description Html
 */
public class Html implements Output {
    @Override
    public void output(List<Map<String, Object>> dataList) {
        System.out.println("Generate html file...");
    }
}

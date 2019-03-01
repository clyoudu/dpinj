package github.clyoudu.dpinj.bridge.output;

import java.util.List;
import java.util.Map;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/3/1 15:22
 * @description Excel
 */
public class Excel implements Output {
    @Override
    public void output(List<Map<String, Object>> dataList) {
        System.out.println("Generated excel file...");
    }
}

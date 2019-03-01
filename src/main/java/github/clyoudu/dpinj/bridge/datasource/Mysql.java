package github.clyoudu.dpinj.bridge.datasource;

import github.clyoudu.dpinj.bridge.output.Output;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/3/1 15:12
 * @description Mysql
 */
public class Mysql extends Datasource {

    public Mysql(Output output) {
        super(output);
    }

    @Override
    public void report(Map<String, Object> configMap) {
        List<Map<String,Object>> dataList = new ArrayList<>();
        System.out.println("Query data list from mysql...");
        output.output(dataList);
    }
}

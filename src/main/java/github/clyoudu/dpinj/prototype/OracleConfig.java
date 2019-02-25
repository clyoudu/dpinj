package github.clyoudu.dpinj.prototype;

import java.io.Serializable;
import java.util.LinkedHashMap;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/2/25 16:30
 * @description OracleConfig
 */
public class OracleConfig implements Config, Serializable {

    private LinkedHashMap<String, String> configItems = new LinkedHashMap<>();

    public void addConfigItem(String key, String value) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(key, value);
        addConfigItems(linkedHashMap);
    }

    public void addConfigItems(LinkedHashMap<String, String> oracleConfigItems) {
        configItems.putAll(oracleConfigItems);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        configItems.forEach((key, value) -> stringBuilder.append(key).append("=").append(value).append("\n"));
        return stringBuilder.toString();
    }
}

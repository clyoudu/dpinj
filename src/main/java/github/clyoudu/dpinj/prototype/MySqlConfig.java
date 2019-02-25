package github.clyoudu.dpinj.prototype;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/2/25 14:13
 * @description MySqlConfig
 */
public class MySqlConfig implements Config, Serializable {

    private Map<String, LinkedHashMap<String, String>> configItems = new HashMap<>();

    @Override
    public Config cloneConfig() throws IOException, ClassNotFoundException {
        return CopyUtil.deepCopy(this);
    }

    public void addConfigItem(String group, String key, String value){
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(key, value);
        addConfigItems(group, linkedHashMap);
    }

    public void addConfigItems(String group, LinkedHashMap<String, String> mySqlConfigItems){
        if(configItems.containsKey(group))
            configItems.get(group).putAll(mySqlConfigItems);
        else
            configItems.put(group, mySqlConfigItems);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, LinkedHashMap<String, String>> entry : configItems.entrySet()) {
            stringBuilder.append("[").append(entry.getKey()).append("]").append("\n");
            LinkedHashMap<String, String> values = entry.getValue();
            if(values != null && !values.isEmpty()){
                values.forEach((key, value) -> stringBuilder.append(key).append("=").append(value).append("\n"));
            }
        }
        return stringBuilder.toString();
    }
}

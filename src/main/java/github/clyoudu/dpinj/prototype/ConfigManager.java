package github.clyoudu.dpinj.prototype;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/2/25 16:26
 * @description ConfigManager
 */
public class ConfigManager {

    private Map<String, Config> configMap = new HashMap<>();
    private static ConfigManager configManager = new ConfigManager();

    private ConfigManager(){
        MySqlConfig mySqlConfig = new MySqlConfig();
        mySqlConfig.addConfigItem("mysqld", "port","3306");
        mySqlConfig.addConfigItem("mysqld", "datadir","/var/lib/mysql");

        mySqlConfig.addConfigItem("mysql_safe", "log-error","/var/log/mariadb/mariadb.log");
        mySqlConfig.addConfigItem("mysql_safe", "pid-file","/var/run/mariadb/mariadb.pid");
        configMap.put("mysql", mySqlConfig);

        OracleConfig oracleConfig = new OracleConfig();
        oracleConfig.addConfigItem("sessions", "472");
        oracleConfig.addConfigItem("process", "300");
        configMap.put("oracle", oracleConfig);
    }

    public void addConfigPrototype(String type, Config config){
        configMap.put(type, config);
    }

    public Config getConfig(String type) throws IOException, ClassNotFoundException {
        return configMap.containsKey(type) ? configMap.get(type).cloneConfig() : null;
    }

    public static ConfigManager getConfigManager(){
        return  configManager;
    }

}

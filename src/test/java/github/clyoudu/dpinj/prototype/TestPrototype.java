package github.clyoudu.dpinj.prototype;

import org.junit.Test;

import java.io.IOException;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/2/25 15:01
 * @description TestPrototype
 */
public class TestPrototype {

    @Test
    public void test(){
        MySqlConfig defaultMySqlConfig = loadFromDatabase();
        try {
            MySqlConfig configA = (MySqlConfig) defaultMySqlConfig.cloneConfig();
            configA.addConfigItem("mysqld", "port", "3307");

            MySqlConfig configB = (MySqlConfig) configA.cloneConfig();
            configB.addConfigItem("mysql_safe", "pid-file", "/var/run/mysql/mysql.pid");

            System.out.println("-----------------------default-------------------------");
            System.out.println(defaultMySqlConfig.toString());

            System.out.println("-----------------------configA-------------------------");
            System.out.println(configA.toString());

            System.out.println("-----------------------configB-------------------------");
            System.out.println(configB.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private MySqlConfig loadFromDatabase() {
        MySqlConfig mySqlConfig = new MySqlConfig();
        mySqlConfig.addConfigItem("mysqld", "port","3306");
        mySqlConfig.addConfigItem("mysqld", "datadir","/var/lib/mysql");

        mySqlConfig.addConfigItem("mysql_safe", "log-error","/var/log/mariadb/mariadb.log");
        mySqlConfig.addConfigItem("mysql_safe", "pid-file","/var/run/mariadb/mariadb.pid");
        return mySqlConfig;
    }

    /*
     -----------------------default-------------------------
     [mysql_safe]
     log-error=/var/log/mariadb/mariadb.log
     pid-file=/var/run/mariadb/mariadb.pid
     [mysqld]
     port=3306
     datadir=/var/lib/mysql

     -----------------------configA-------------------------
     [mysql_safe]
     log-error=/var/log/mariadb/mariadb.log
     pid-file=/var/run/mariadb/mariadb.pid
     [mysqld]
     port=3307
     datadir=/var/lib/mysql

     -----------------------configB-------------------------
     [mysql_safe]
     log-error=/var/log/mariadb/mariadb.log
     pid-file=/var/run/mysql/mysql.pid
     [mysqld]
     port=3307
     datadir=/var/lib/mysql
     */

    @Test
    public void test1() throws IOException, ClassNotFoundException {
        ConfigManager configManager = ConfigManager.getConfigManager();
        MySqlConfig mySqlConfig = (MySqlConfig) configManager.getConfig("mysql");
        mySqlConfig.addConfigItem("mysqld", "port", "3307");

        OracleConfig oracleConfig = (OracleConfig) configManager.getConfig("oracle");
        oracleConfig.addConfigItem("sessions", "1000");

        System.out.println(mySqlConfig.toString());
        System.out.println(oracleConfig.toString());
    }
    /*
    log-error=/var/log/mariadb/mariadb.log
    pid-file=/var/run/mariadb/mariadb.pid
    [mysqld]
    port=3307
    datadir=/var/lib/mysql

    sessions=1000
    process=300
    */

}

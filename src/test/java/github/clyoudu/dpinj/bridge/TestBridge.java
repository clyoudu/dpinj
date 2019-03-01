package github.clyoudu.dpinj.bridge;

import github.clyoudu.dpinj.bridge.datasource.Datasource;
import github.clyoudu.dpinj.bridge.datasource.MongoDb;
import github.clyoudu.dpinj.bridge.datasource.Mysql;
import github.clyoudu.dpinj.bridge.datasource.RestApi;
import github.clyoudu.dpinj.bridge.output.Excel;
import github.clyoudu.dpinj.bridge.output.Html;
import github.clyoudu.dpinj.bridge.output.Mail;
import github.clyoudu.dpinj.bridge.output.Output;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/3/1 15:25
 * @description TestBridge
 */
public class TestBridge {

    @Test
    public void test(){
        Map<String,Object> configMap = new HashMap<>();

        Output mail = new Mail();
        Output html = new Html();
        Output mysql = new github.clyoudu.dpinj.bridge.output.Mysql();
        Output excel = new Excel();

        Datasource mysqls = new Mysql(mail);
        Datasource mongoDb = new MongoDb(html);
        Datasource restApi = new RestApi(excel);
        Datasource restApi1 = new RestApi(mysql);

        System.out.println("----------mysql => mail------------");
        mysqls.report(configMap);
        System.out.println("\n----------mongodb => html------------");
        mongoDb.report(configMap);
        System.out.println("\n----------rest api => excel------------");
        restApi.report(configMap);
        System.out.println("\n----------rest api => mysql------------");
        restApi1.report(configMap);
    }
    /*
    ----------mysql => mail------------
    Query data list from mysql...
    Send mail...

    ----------mongodb => html------------
    Query data list from mongo db...
    Generate html file...

    ----------rest api => excel------------
    Query data list from REST API...
    Generated excel file...

    ----------rest api => mysql------------
    Query data list from REST API...
    Save to mysql...
     */

}

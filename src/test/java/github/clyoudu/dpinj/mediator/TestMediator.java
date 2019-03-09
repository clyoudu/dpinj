package github.clyoudu.dpinj.mediator;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/9
 * @time 17:08
 * @desc TestMediator
 */
public class TestMediator {

    @Test
    public void test() {
        UserManager userManager = new UserManager();
        Mysql mysql = new Mysql(userManager);
        Mongo mongo = new Mongo(userManager);
        Redis redis = new Redis(userManager);

        userManager.setMongo(mongo);
        userManager.setMysql(mysql);
        userManager.setRedis(redis);

        System.out.println(redis.selectUser(1));
        System.out.println(redis.selectUser(1));
        System.out.println(redis.select(1));

        System.out.println();

        System.out.println(mysql.loginUser(new User(1, "Ashe")));

        System.out.println();

        System.out.println(mysql.updateUser(new User(1, "Zed")));

        System.out.println();

        System.out.println(redis.selectUser(1));

        /*
        select user info from redis...
        select user info from mysql...
        update redis user info...
        {"id":1,"username":"Ashe"}
        select user info from redis...
        {"id":1,"username":"Ashe"}
        select user info from redis...
        {"id":1,"username":"Ashe"}

        update mysql user login time...
        insert mongo user login time...
        {"id":1,"lastLoginTime":"2019-03-09T17:24:36.214","username":"Ashe"}

        update mysql user info...
        update redis user info...
        {"id":1,"username":"Zed"}

        select user info from redis...
        {"id":1,"username":"Zed"}
         */
    }

}

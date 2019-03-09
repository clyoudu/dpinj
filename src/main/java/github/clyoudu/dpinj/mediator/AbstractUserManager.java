package github.clyoudu.dpinj.mediator;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/9
 * @time 16:46
 * @desc AbstractUserManager
 */
public abstract class AbstractUserManager {

    protected Mongo mongo;

    protected Mysql mysql;

    protected Redis redis;

    public abstract User update(Datasource datasource, User user);

    public abstract User select(Datasource datasource, Integer id);

    public abstract User login(Datasource datasource, User user);

    public Mongo getMongo() {
        return mongo;
    }

    public void setMongo(Mongo mongo) {
        this.mongo = mongo;
    }

    public Mysql getMysql() {
        return mysql;
    }

    public void setMysql(Mysql mysql) {
        this.mysql = mysql;
    }

    public Redis getRedis() {
        return redis;
    }

    public void setRedis(Redis redis) {
        this.redis = redis;
    }

}

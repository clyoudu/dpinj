package github.clyoudu.dpinj.mediator;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/9
 * @time 16:44
 * @desc UserManager
 */
public class UserManager extends AbstractUserManager {

    @Override
    public User update(Datasource datasource, User user) {
        if (datasource instanceof Mysql) {
            datasource.update(user);
            redis.update(user);
            return user;
        }
        return datasource.update(user);
    }

    @Override
    public User select(Datasource datasource, Integer id) {
        User user;
        if (datasource instanceof Redis) {
            if ((user = datasource.select(id)) != null) {
                return user;
            } else {
                user = mysql.select(id);
                datasource.update(user);
                return user;
            }
        } else {
            return datasource.select(id);
        }

    }

    @Override
    public User login(Datasource datasource, User user) {
        if (datasource instanceof Mysql) {
            if ((user = datasource.login(user)) != null) {
                mongo.login(user);
                return user;
            }
        }
        return datasource.login(user);
    }
}

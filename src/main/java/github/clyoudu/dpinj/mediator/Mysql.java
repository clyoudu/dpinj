package github.clyoudu.dpinj.mediator;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/9
 * @time 16:21
 * @desc Mysql
 */
public class Mysql extends Datasource {

    private static final Map<Integer, User> users = new HashMap<>();
    static {
        users.put(1, new User(1, "Ashe"));
        users.put(2, new User(1, "Bob"));
    }

    public Mysql(UserManager userManager) {
        super(userManager);
    }

    @Override
    public User update(User user) {
        if (user != null && user.getId() != null && users.containsKey(user.getId())) {
            users.put(user.getId(), user);
            System.out.println("update mysql user info...");
            return user;
        } else {
            throw new IllegalArgumentException("unknown user...");
        }
    }

    @Override
    public User select(Integer id) {
        System.out.println("select user info from mysql...");
        return users.get(id);
    }

    @Override
    public User login(User user) {
        if (user != null && users.containsKey(user.getId())) {
            users.get(user.getId()).setLastLoginTime(LocalDateTime.now());
            System.out.println("update mysql user login time...");
            return users.get(user.getId());
        } else {
            throw new IllegalArgumentException("unknown user...");
        }
    }
}

package github.clyoudu.dpinj.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/9
 * @time 16:22
 * @desc Redis
 */
public class Redis extends Datasource {

    private static final Map<Integer, User> users = new HashMap<>();

    public Redis(UserManager userManager) {
        super(userManager);
    }

    @Override
    public User update(User user) {
        if (user != null && user.getId() != null) {
            users.put(user.getId(), user);
            System.out.println("update redis user info...");
            return user;
        } else {
            throw new IllegalArgumentException("error user...");
        }
    }

    @Override
    public User select(Integer id) {
        System.out.println("select user info from redis...");
        return users.get(id);
    }

    @Override
    public User login(User user) {
        throw new UnsupportedOperationException();
    }
}

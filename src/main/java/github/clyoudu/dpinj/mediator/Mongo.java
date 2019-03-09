package github.clyoudu.dpinj.mediator;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/9
 * @time 16:35
 * @desc Mongo
 */
public class Mongo extends Datasource {

    private static final Map<Integer, List<User>> users = new HashMap<>();

    public Mongo(UserManager userManager) {
        super(userManager);
    }

    @Override
    public User update(User user) {
        throw new UnsupportedOperationException();
    }

    @Override
    public User select(Integer id) {
        System.out.println("select user info from mongo...");
        if(!users.containsKey(id)){
            throw new RuntimeException("no user login data found in mongo...");
        }
        return users.get(id).get(0);
    }

    @Override
    public User login(User user) {
        if(user == null || user.getId() == null){
            throw new IllegalArgumentException("unknown user...");
        }

        System.out.println("insert mongo user login time...");
        if (users.containsKey(user.getId())) {
            users.get(user.getId()).add(user);
        } else {
            users.put(user.getId(), Collections.singletonList(user));
        }
        return user;
    }
}

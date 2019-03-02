package github.clyoudu.dpinj.proxy;

import java.util.Set;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/2
 * @time 17:05
 * @desc User
 */
public class User {

    private String username;

    private Set<String> permissions;

    public User(String username, Set<String> permissions){
        this.permissions = permissions;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public Set<String> getPermissions() {
        return permissions;
    }

    public User setPermissions(Set<String> permissions) {
        this.permissions = permissions;
        return this;
    }
}

package github.clyoudu.dpinj.mediator;

import com.alibaba.fastjson.JSON;

import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/9
 * @time 16:25
 * @desc User
 */
public class User {

    private Integer id;

    private String username;

    private LocalDateTime lastLoginTime;

    public User(Integer id, String username) {
        this.id = id;
        this.username = username;
    }

    public User setId(Integer id) {
        this.id = id;
        return this;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setLastLoginTime(LocalDateTime lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public LocalDateTime getLastLoginTime() {
        return lastLoginTime;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}

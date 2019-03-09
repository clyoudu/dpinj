package github.clyoudu.dpinj.mediator;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/9
 * @time 16:19
 * @desc Datasource
 */
public abstract class Datasource {

    protected UserManager userManager;

    public Datasource(UserManager userManager){
        this.userManager = userManager;
    }

    public User updateUser(User user){
        return userManager.update(this, user);
    }
    public User selectUser(Integer id){
        return userManager.select(this, id);
    }
    public User loginUser(User user){
        return userManager.login(this, user);
    }

    public abstract User update(User user);

    public abstract User select(Integer id);

    public abstract User login(User user);

}

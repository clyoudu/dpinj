package github.clyoudu.dpinj.proxy;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/2
 * @time 17:23
 * @desc PermissionChecker
 */
public class PermissionChecker {

    private User user;

    public PermissionChecker(User user){
        this.user = user;
    }

    public boolean hashPermission(Permission permission){
        return user.getPermissions() != null && user.getPermissions().contains(permission.toString());
    }

}

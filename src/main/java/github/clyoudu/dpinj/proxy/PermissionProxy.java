package github.clyoudu.dpinj.proxy;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/2
 * @time 17:00
 * @desc PermissionProxy
 */
public class PermissionProxy {

    private Permission permission;

    public PermissionProxy(Permission permission){
        this.permission = permission;
    }

    public void execute(User user, String target){
        if(new PermissionChecker(user).hashPermission(permission)){
            permission.execute(user, target);
        }else{
            System.out.println(user.getUsername() + " has no " + permission.toString() + " permission...");
        }
    }

}

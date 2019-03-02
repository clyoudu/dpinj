package github.clyoudu.dpinj.proxy;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/2
 * @time 16:56
 * @desc DeletePermission
 */
public class DeletePermission implements Permission {
    @Override
    public void execute(User user, String target) {
        System.out.println(user.getUsername() + " execute delete on " + target + "...");
    }

    @Override
    public String toString() {
        return "delete";
    }
}

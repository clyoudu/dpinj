package github.clyoudu.dpinj.proxy;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/2
 * @time 16:57
 * @desc UpdatePermission
 */
public class UpdatePermission implements Permission {
    @Override
    public void execute(User user, String target) {
        System.out.println(user.getUsername() + " execute update...");
    }

    @Override
    public String toString() {
        return "update";
    }
}

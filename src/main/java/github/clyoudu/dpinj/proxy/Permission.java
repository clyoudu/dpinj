package github.clyoudu.dpinj.proxy;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/2
 * @time 16:54
 * @desc Permission
 */
public interface Permission {

    void execute(User user, String target);

}

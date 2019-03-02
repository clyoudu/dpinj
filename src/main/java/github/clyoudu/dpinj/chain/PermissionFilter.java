package github.clyoudu.dpinj.chain;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/2
 * @time 18:14
 * @desc PermissionFilter
 */
public class PermissionFilter extends Filter {
    @Override
    public void handle(Request request) {
        System.out.println("Check permission...");
        if(request.getHeader().get("user").equals("admin")){
            if(getNext() != null){
                getNext().handle(request);
            }
        }else{
            System.out.println("user " + request.getHeader().get("user") + " has no permission...");
        }
        /*
        Check login status...
        Check token...
        Check permission...
        URL decode...
        http://www.google.com/s={}
        Check login status...
        Check token...
        Check permission...
        user ashe has no permission...
         */
    }
}

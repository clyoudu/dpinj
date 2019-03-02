package github.clyoudu.dpinj.chain;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/2
 * @time 18:10
 * @desc LoginCheckFilter
 */
public class LoginCheckFilter extends Filter {
    @Override
    public void handle(Request request) {
        System.out.println("Check login status...");
        if(request.getHeader().get("token") != null){
            if(getNext() != null){
                getNext().handle(request);
            }
        }else{
            System.out.println("Please login...");
        }
    }
}

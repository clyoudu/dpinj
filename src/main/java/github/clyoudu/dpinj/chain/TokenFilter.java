package github.clyoudu.dpinj.chain;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/2
 * @time 18:13
 * @desc TokenFilter
 */
public class TokenFilter extends Filter {
    @Override
    public void handle(Request request) {
        System.out.println("Check token...");
        if("1".equals(request.getHeader().get("token"))){
            if(getNext() != null){
                getNext().handle(request);
            }
        }else{
            System.out.println("Error token...");
        }
    }
}

package github.clyoudu.dpinj.chain;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/2
 * @time 18:19
 * @desc TestChain
 */
public class TestChain {

    @Test
    public void test() {
        Filter filter = new LoginCheckFilter().setNext(new TokenFilter().setNext(new PermissionFilter().setNext(new UrlDecodeFilter())));
        Map<String, String> header = new HashMap<>();
        header.put("token", "1");
        header.put("user", "admin");
        Request request = new Request("http://www.google.com/s=%7B%7D", header);
        filter.handle(request);
        System.out.println(request.getUrl());

        header.put("user", "ashe");
        filter.handle(new Request("http://www.google.com/s=%7B%7D", header));


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

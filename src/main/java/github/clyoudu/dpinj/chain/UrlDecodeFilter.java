package github.clyoudu.dpinj.chain;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/2
 * @time 18:05
 * @desc UrlDecodeFilter
 */
public class UrlDecodeFilter extends Filter {
    @Override
    public void handle(Request request) {
        System.out.println("URL decode...");
        String url = request.getUrl();
        try {
            request.setUrl(URLDecoder.decode(url, "utf-8"));
            if(getNext() != null){
                getNext().handle(request);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}

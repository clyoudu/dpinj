package github.clyoudu.dpinj.chain;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/2
 * @time 18:01
 * @desc Request
 */
public class Request {

    private String url;

    private Map<String, String> header = new HashMap<>();

    public Request(String url, Map<String, String> header) {
        this.url = url;
        this.header = header;
    }

    public String getUrl() {
        return url;
    }

    public Request setUrl(String url) {
        this.url = url;
        return this;
    }

    public Map<String, String> getHeader() {
        return header;
    }

    public Request setHeader(Map<String, String> header) {
        this.header = header;
        return this;
    }
}

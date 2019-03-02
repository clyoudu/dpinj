package github.clyoudu.dpinj.chain;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/2
 * @time 18:00
 * @desc Filter
 */
public abstract class Filter {

    protected Filter next;

    public  abstract void handle(Request request);

    public Filter setNext(Filter next) {
        this.next = next;
        return this;
    }

    public Filter getNext() {
        return next;
    }
}

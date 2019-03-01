package github.clyoudu.dpinj.composite;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/1
 * @time 21:38
 * @desc Element
 */
public abstract class Element {

    protected String name;

    public Element(String name) {
        this.name = name;
    }

    public abstract void sendMail();

}

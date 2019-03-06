package github.clyoudu.dpinj.command;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/3/6 17:48
 * @description Gesture
 */
public abstract class Gesture {

    protected Handler handler;

    public Gesture(Handler handler){
        this.handler = handler;
    }

    public Handler getHandler() {
        return handler;
    }

    public abstract void action();

}

package github.clyoudu.dpinj.command;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/3/6 17:57
 * @description LongPress
 */
public class LongPress extends Gesture {
    public LongPress(Handler handler) {
        super(handler);
    }

    @Override
    public void action() {
        System.out.println("Handle LongPress...");
        handler.handle();
    }
}

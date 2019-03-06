package github.clyoudu.dpinj.command;

import java.util.List;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/3/6 17:49
 * @description Component
 */
public abstract class Component {

    protected List<Gesture> gestures;

    public Component(List<Gesture> gestures) {
        this.gestures = gestures;
    }

    public void setGestures(List<Gesture> gestures) {
        this.gestures = gestures;
    }

    public abstract void apply();
}

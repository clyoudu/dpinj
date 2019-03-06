package github.clyoudu.dpinj.command;

import java.util.List;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/3/6 17:51
 * @description TextView
 */
public class TextView extends Component {

    public TextView(List<Gesture> gestures) {
        super(gestures);
    }

    @Override
    public void apply() {
        for (Gesture gesture : gestures) {
            System.out.println("Invoke gesture " + gesture.getClass().getSimpleName() + "...");
            gesture.action();
        }
    }
}

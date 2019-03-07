package github.clyoudu.dpinj.command;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/7
 * @time 20:59
 * @desc ImageView
 */
public class ImageView extends Component {

    public ImageView(List<Gesture> gestures) {
        super(gestures);
    }

    @Override
    public void apply() {
        System.out.println("Command from ImageView...");
        for (Gesture gesture : gestures) {
            System.out.println("Invoke gesture " + gesture.getClass().getSimpleName() + "...");
            gesture.action();
        }
    }
}

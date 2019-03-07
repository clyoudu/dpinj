package github.clyoudu.dpinj.command;

import org.junit.Test;

import java.util.Collections;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/3/6 18:02
 * @description TestCommand
 */
public class TestCommand {

    @Test
    public void test() {
        new TextView(Collections.singletonList(new LongPress(new ContextMenuHandler()))).apply();
        System.out.println();
        new ImageView(Collections.singletonList(new LongPress(new PhotoGalleryHandler()))).apply();
    }
    /*
    Command from TextView...
    Invoke gesture LongPress...
    Handle LongPress...
    Display context menu...

    Command from ImageView...
    Invoke gesture LongPress...
    Handle LongPress...
    Display photo gallery...
     */

}

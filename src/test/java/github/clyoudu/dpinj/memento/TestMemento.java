package github.clyoudu.dpinj.memento;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/9
 * @time 18:34
 * @desc TestMemento
 */
public class TestMemento {

    @Test
    public void test() {
        MementoManager mementoManager = new MementoManager();
        Chessman chessman = new Chessman("Q", new Coordinate(0, 0));
        mementoManager.addMemento(chessman.save());

        mementoManager.redo(chessman);
        mementoManager.undo(chessman);

        chessman.setCoordinate(new Coordinate(1, 1));
        mementoManager.addMemento(chessman.save());

        mementoManager.redo(chessman);

        mementoManager.undo(chessman);
        mementoManager.undo(chessman);
        mementoManager.redo(chessman);
        mementoManager.redo(chessman);
        mementoManager.undo(chessman);

        chessman.setCoordinate(new Coordinate(2, 2));
        mementoManager.addMemento(chessman.save());

        mementoManager.undo(chessman);
        mementoManager.undo(chessman);
        mementoManager.redo(chessman);
        mementoManager.redo(chessman);
    }

}

package github.clyoudu.dpinj.memento;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/9
 * @time 18:03
 * @desc Coordinate
 */
public class Coordinate {

    private int x;

    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public Coordinate setX(int x) {
        this.x = x;
        return this;
    }

    public int getY() {
        return y;
    }

    public Coordinate setY(int y) {
        this.y = y;
        return this;
    }
}

package github.clyoudu.dpinj.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/9
 * @time 18:01
 * @desc Memento
 */
public class Memento {

    private String label;

    private Coordinate coordinate;

    public Memento(String label, Coordinate coordinate) {
        this.label = label;
        this.coordinate = coordinate;
    }

    public String getLabel() {
        return label;
    }

    public Memento setLabel(String label) {
        this.label = label;
        return this;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public Memento setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
        return this;
    }
}

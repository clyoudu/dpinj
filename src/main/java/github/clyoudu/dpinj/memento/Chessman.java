package github.clyoudu.dpinj.memento;

import com.alibaba.fastjson.JSON;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/9
 * @time 17:58
 * @desc Chessman
 */
public class Chessman {

    private String label;

    private Coordinate coordinate;

    public Chessman(String label, Coordinate coordinate) {
        this.label = label;
        this.coordinate = coordinate;
        System.out.println("[init] " + JSON.toJSONString(this));
    }

    public String getLabel() {
        return label;
    }

    public Chessman setLabel(String label) {
        this.label = label;
        System.out.println("[set label] " + JSON.toJSONString(this));
        return this;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public Chessman setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
        System.out.println("[set coordinate] " + JSON.toJSONString(this));
        return this;
    }

    public Memento save() {
        return new Memento(label, coordinate);
    }

    public void reset(Memento memento) {
        this.coordinate = memento.getCoordinate();
        this.label = memento.getLabel();
    }
}

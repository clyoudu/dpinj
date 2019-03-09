package github.clyoudu.dpinj.memento;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/9
 * @time 18:08
 * @desc MementoManager
 */
public class MementoManager {

    private List<Memento> mementos = new ArrayList<>();

    private int index = -1;

    public void addMemento(Memento memento) {
        if(index < mementos.size() - 1) {
            mementos = mementos.subList(0, index + 1);
        }
        mementos.add(memento);
        index = mementos.size() - 1;
    }

    public void undo(Chessman chessman) {
        if(mementos.isEmpty() || index <= 0) {
            System.out.println("[undo] no more memento available...");
        }else {
            Memento memento = mementos.get(index - 1);
            System.out.println(String.format("[undo] %s", JSON.toJSON(memento)));
            chessman.reset(memento);
            index --;
        }
    }

    public void redo(Chessman chessman) {
        if(mementos.isEmpty()|| index >= mementos.size() - 1){
            System.out.println("[redo] no more memento available...");
        }else{
            Memento memento = mementos.get(index + 1);
            System.out.println(String.format("[redo] %s", JSON.toJSON(memento)));
            chessman.reset(memento);
            index ++;
        }
    }

}

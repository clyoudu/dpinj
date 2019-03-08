package github.clyoudu.dpinj.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/8
 * @time 22:52
 * @desc MyList
 */
public class MyList<E> extends ArrayList<E> {

    @Override
    public Iterator<E> iterator() {
        return new MyIterator<>(this);
    }
}

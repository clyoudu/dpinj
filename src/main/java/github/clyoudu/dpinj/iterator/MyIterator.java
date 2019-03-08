package github.clyoudu.dpinj.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/8
 * @time 22:53
 * @desc MyIterator
 */
public class MyIterator<E> implements Iterator<E> {

    private List<E> list;

    private int cursor = 0;

    public MyIterator(List<E> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cursor < list.size();
    }

    @Override
    public E next() {
        return list.get(cursor++);
    }
}

package github.clyoudu.dpinj.iterator;

import org.junit.Test;

import java.util.Iterator;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/3/8
 * @time 22:56
 * @desc TestIterator
 */
public class TestIterator {

    @Test
    public void test() {
        MyList<String> myList = new MyList<>();
        myList.add("a");
        myList.add("b");
        myList.add("c");
        myList.add("d");

        Iterator<String> iterator = new MyIterator<>(myList);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}

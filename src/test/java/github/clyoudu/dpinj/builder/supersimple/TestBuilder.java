package github.clyoudu.dpinj.builder.supersimple;

import org.junit.Test;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/2/26 9:27
 * @description TestBuilder
 */
public class TestBuilder {

    @Test
    public void test(){
        System.out.println(new Timetable.TimetableBuilder()
                .sunday("Sun")
                .monday("Mon")
                .tuesday("Tue")
                .wednesday("Wed")
                .thursday("Thu")
                .friday("Fri")
                .saturday("Sat")
                .build().toString());
    }

}

package github.clyoudu.dpinj.builder.simple;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/2/25
 * @time 22:40
 * @desc TestBuilder
 */
public class TestBuilder {

    @Test
    public void test(){
        System.out.println(new ComputerScienceTimetableBuilder().buildTimetable().toString());
        System.out.println();
        System.out.println(new SoftwareEngineeringTimetableBuilder().buildTimetable().toString());
    }

}

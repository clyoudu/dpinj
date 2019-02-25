package github.clyoudu.dpinj.builder;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/2/25
 * @time 22:26
 * @desc TestBuilder
 */
public class TestBuilder {

    @Test
    public void test(){
        System.out.println(new TimetableDirector(new ComputerScienceTimetableBuilder()).buildTimetable().toString());
        System.out.println();
        System.out.println(new TimetableDirector(new SoftwareEngineeringTimetableBuilder()).buildTimetable().toString());
        /*
        Sunday:
        Monday: Spoken English
        Tuesday: Advanced mathematics
        Wednesday: College Physics
        Thursday: C Language
        Friday: Sports
        Saturday: Situation and Policy

        Sunday:
        Monday: Sports
        Tuesday: Discrete Mathematics
        Wednesday: College Physics
        Thursday: Professional English
        Friday: Probability Statistics
        Saturday: Situation and Policy
         */
    }

}

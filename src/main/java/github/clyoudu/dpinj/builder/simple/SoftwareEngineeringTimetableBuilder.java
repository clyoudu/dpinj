package github.clyoudu.dpinj.builder.simple;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/2/25
 * @time 22:08
 * @desc SoftwareEngineeringTimetableBuilder
 */
public class SoftwareEngineeringTimetableBuilder extends TimetableBuilder {
    @Override
    public void sunday() {
        timetable.setSunday("");
    }

    @Override
    public void monday() {
        timetable.setMonday("Sports");
    }

    @Override
    public void tuesday() {
        timetable.setTuesday("Discrete Mathematics");
    }

    @Override
    public void wednesday() {
        timetable.setWednesday("College Physics");
    }

    @Override
    public void thursday() {
        timetable.setThursday("Professional English");
    }

    @Override
    public void friday() {
        timetable.setFriday("Probability Statistics");
    }

    @Override
    public void saturday() {
        timetable.setSaturday("Situation and Policy");
    }
}

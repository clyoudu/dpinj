package github.clyoudu.dpinj.builder.simple;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/2/25
 * @time 22:04
 * @desc ComputerScienceTimetableBuilder
 */
public class ComputerScienceTimetableBuilder extends TimetableBuilder {
    @Override
    public void sunday() {
        timetable.setSunday("");
    }

    @Override
    public void monday() {
        timetable.setMonday("Spoken English");
    }

    @Override
    public void tuesday() {
        timetable.setTuesday("Advanced mathematics");
    }

    @Override
    public void wednesday() {
        timetable.setWednesday("College Physics");
    }

    @Override
    public void thursday() {
        timetable.setThursday("C Language");
    }

    @Override
    public void friday() {
        timetable.setFriday("Sports");
    }

    @Override
    public void saturday() {
        timetable.setSaturday("Situation and Policy");
    }
}

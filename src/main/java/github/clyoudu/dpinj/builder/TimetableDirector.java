package github.clyoudu.dpinj.builder;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/2/25
 * @time 22:10
 * @desc TimetableDirector
 */
public class TimetableDirector {

    private TimetableBuilder timetableBuilder;

    public TimetableDirector(TimetableBuilder timetableBuilder) {
        this.timetableBuilder = timetableBuilder;
    }

    public Timetable buildTimetable(){

        timetableBuilder.sunday();
        timetableBuilder.monday();
        timetableBuilder.tuesday();
        timetableBuilder.wednesday();
        timetableBuilder.thursday();
        timetableBuilder.friday();
        timetableBuilder.saturday();

        return timetableBuilder.buildTimetable();
    }

}

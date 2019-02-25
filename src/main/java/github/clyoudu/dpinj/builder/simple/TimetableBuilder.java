package github.clyoudu.dpinj.builder.simple;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/2/25
 * @time 21:55
 * @desc TimetableBuilder
 */
public abstract class TimetableBuilder {

    protected Timetable timetable = new Timetable();

    public abstract void sunday();
    public abstract void monday();
    public abstract void tuesday();
    public abstract void wednesday();
    public abstract void thursday();
    public abstract void friday();
    public abstract void saturday();

    public Timetable buildTimetable(){
        sunday();
        monday();
        tuesday();
        wednesday();
        thursday();
        friday();
        saturday();
        return timetable;
    }

}

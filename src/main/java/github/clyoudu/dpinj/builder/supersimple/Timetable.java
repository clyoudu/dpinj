package github.clyoudu.dpinj.builder.supersimple;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2019/2/25
 * @time 21:52
 * @desc Timetable
 */
public class Timetable {

    private String sunday;

    private String monday;

    private String tuesday;

    private String wednesday;

    private String thursday;

    private String friday;

    private String saturday;



    @Override
    public String toString() {
        return "Sunday: " + sunday + "\n" +
                "Monday: " + monday + "\n" +
                "Tuesday: " + tuesday + "\n" +
                "Wednesday: " + wednesday + "\n" +
                "Thursday: " + thursday + "\n" +
                "Friday: " + friday + "\n" +
                "Saturday: " + saturday;
    }
}

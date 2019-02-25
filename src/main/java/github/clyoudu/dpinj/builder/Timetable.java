package github.clyoudu.dpinj.builder;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

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

    public String getSunday() {
        return sunday;
    }

    public Timetable setSunday(String sunday) {
        this.sunday = sunday;
        return this;
    }

    public String getMonday() {
        return monday;
    }

    public Timetable setMonday(String monday) {
        this.monday = monday;
        return this;
    }

    public String getTuesday() {
        return tuesday;
    }

    public Timetable setTuesday(String tuesday) {
        this.tuesday = tuesday;
        return this;
    }

    public String getWednesday() {
        return wednesday;
    }

    public Timetable setWednesday(String wednesday) {
        this.wednesday = wednesday;
        return this;
    }

    public String getThursday() {
        return thursday;
    }

    public Timetable setThursday(String thursday) {
        this.thursday = thursday;
        return this;
    }

    public String getFriday() {
        return friday;
    }

    public Timetable setFriday(String friday) {
        this.friday = friday;
        return this;
    }

    public String getSaturday() {
        return saturday;
    }

    public Timetable setSaturday(String saturday) {
        this.saturday = saturday;
        return this;
    }

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

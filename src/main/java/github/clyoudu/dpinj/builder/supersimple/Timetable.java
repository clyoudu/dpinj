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

    public Timetable() {
    }

    public Timetable(Timetable timetable) {
        this.sunday = timetable.getSunday();
        this.monday = timetable.getMonday();
        this.tuesday = timetable.getTuesday();
        this.wednesday = timetable.getWednesday();
        this.thursday = timetable.getThursday();
        this.friday = timetable.getFriday();
        this.saturday = timetable.getSaturday();
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

    public String getSunday() {
        return this.sunday;
    }

    public void setSunday(String sunday) {
        this.sunday = sunday;
    }

    public String getMonday() {
        return this.monday;
    }

    public void setMonday(String monday) {
        this.monday = monday;
    }

    public String getTuesday() {
        return this.tuesday;
    }

    public void setTuesday(String tuesday) {
        this.tuesday = tuesday;
    }

    public String getWednesday() {
        return this.wednesday;
    }

    public void setWednesday(String wednesday) {
        this.wednesday = wednesday;
    }

    public String getThursday() {
        return this.thursday;
    }

    public void setThursday(String thursday) {
        this.thursday = thursday;
    }

    public String getFriday() {
        return this.friday;
    }

    public void setFriday(String friday) {
        this.friday = friday;
    }

    public String getSaturday() {
        return this.saturday;
    }

    public void setSaturday(String saturday) {
        this.saturday = saturday;
    }

    public static class TimetableBuilder {
        private Timetable timetable;

        public TimetableBuilder() {
            this.timetable = new Timetable();
        }

        public TimetableBuilder sunday(String sunday) {
            this.timetable.setSunday(sunday);
            return this;
        }

        public TimetableBuilder monday(String monday) {
            this.timetable.setMonday(monday);
            return this;
        }

        public TimetableBuilder tuesday(String tuesday) {
            this.timetable.setTuesday(tuesday);
            return this;
        }

        public TimetableBuilder wednesday(String wednesday) {
            this.timetable.setWednesday(wednesday);
            return this;
        }

        public TimetableBuilder thursday(String thursday) {
            this.timetable.setThursday(thursday);
            return this;
        }

        public TimetableBuilder friday(String friday) {
            this.timetable.setFriday(friday);
            return this;
        }

        public TimetableBuilder saturday(String saturday) {
            this.timetable.setSaturday(saturday);
            return this;
        }

        public Timetable build() {
            return new Timetable(this.timetable);
        }
    }
}

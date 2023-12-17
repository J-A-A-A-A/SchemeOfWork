import java.lang.reflect.Array;
import java.util.ArrayList;

public class Timetable {
    private ArrayList<Period> timetable;
    private String[] daysOfWeek = {"Monday", "Tuesday","Wednesday","Thursday","Friday"};

    public Timetable(ArrayList<Period> timetable) {
        this.timetable = timetable;
    }
}

public class Period {
    private int number;

    private String dayOfWeek;

    private String weekNo ;

    private Lesson lesson;

    public Period(int number, String dayOfWeek,  String weekNo) {
        this.number = number;
        this.weekNo = weekNo;
        this.dayOfWeek = dayOfWeek;
    }

    // TODO: Assign a lesson to one of the periods
    public void setLesson(Lesson lesson) {
        this.lesson = lesson;

    }

    public void setPeriod(int periodNumber, String date){
        this.number = periodNumber;
        this.lesson.setDate(date);
    }
}

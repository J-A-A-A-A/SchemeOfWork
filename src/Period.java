public class Period {
    private String dayOfWeek;
    private int number;
    private int year;
    private String subject;
    private String classCode;
    private Lesson lesson;

    public Period(String dayOfWeek, int number, int year, String subject, String classCode) {
        this.dayOfWeek = dayOfWeek;
        this.number = number;
        this.year = year;
        this.subject = subject;
        this.classCode = classCode;
    }

    // TODO: Assign a lesson to one of the periods
    public void setLesson(Lesson lesson) {
        this.lesson = lesson;

    }

    public void setPeriod(int periodNumber, String date){
        this.number = periodNumber;
        this.lesson.setDate(date);
    }

    public int getYear() {
        return year;
    }

    public String getSubject() {
        return subject;
    }

    public String getClassCode() {
        return classCode;
    }
}

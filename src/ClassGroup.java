import java.util.ArrayList;

public class ClassGroup {
    private String classCode;
    private int year;
    private String subject;
    private ArrayList<Topic> topics = new ArrayList<>();
    private ArrayList<Integer> periodNumbers;

    public ClassGroup(String classCode, int year, String subject, ArrayList<Integer> periodNumbers) {
        this.classCode = classCode;
        this.year = year;
        this.subject = subject;
        this.periodNumbers = periodNumbers;
    }

    public void addTopic(Topic topic){
        this.topics.add(topic);
    }
    public void addPeriodNumber(int periodNumber){
        this.periodNumbers.add(periodNumber);
    }

    public int getYear() {
        return year;
    }

    public String getSubject() {
        return subject;
    }
}

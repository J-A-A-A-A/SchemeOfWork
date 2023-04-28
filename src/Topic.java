
import java.util.ArrayList;

public class Topic {
    private int yearGroup;
    private String subject;
    private int number;
    private String name;

    //Constructor
    public Topic(int yearGroup, String subject, int number, String name) {
        this.yearGroup = yearGroup;
        this.subject = subject;
        this.number = number;
        this.name = name;
    }
    //Getters

    public int getYearGroup() {
        return yearGroup;
    }

    public String getSubject() {
        return subject;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    //Setters
    public void setYearGroup(int yearGroup) {
        this.yearGroup = yearGroup;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}

import java.util.ArrayList;

public class Topic {

    private int id;
    private int yearGroup;
    private String subject;
    private int number  ;
    private String name;
    private ArrayList<SubTopic> subTopics;

    //Constructor
    public Topic(int id, int yearGroup, String subject, int number, String name) {
        this.id = id ;
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

    public void addSingleSubtopic(SubTopic subTopic){
        subTopics.add(subTopic);
    }

    public void setSubtopics(ArrayList<SubTopic> subTopic){
        this.subTopics = subTopic;
    }

    public ArrayList<SubTopic> getSubtopic(){
        return subTopics;
    }


    public int getID() {
        return this.id;
    }

}
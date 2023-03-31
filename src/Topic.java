
import java.util.ArrayList;

public class Topic {
    private int yearGroup;
    private String subject;
    private int number;
    private String name;
    private ArrayList<SubTopic> subTopics;

    //Constructor
    public Topic(int yearGroup, String subject, int number, String name, ArrayList<SubTopic> subTopics) {
        this.yearGroup = yearGroup;
        this.subject = subject;
        this.number = number;
        this.name = name;
        this.subTopics = subTopics;
    }
    // Getters
    public int getYearGroup() {
        return yearGroup;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public ArrayList<SubTopic> getSubTopics() {
        return subTopics;
    }

    public String getSubject() {
        return subject;
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

    //TODO: Add subtopic to topic

    public void addSubTopic(SubTopic newSubTopic){
        subTopics.add(newSubTopic);
    }
    //TODO: Remove subtopic from topic
    public void removeSubTopic(SubTopic newSubTopic){
        subTopics.remove(newSubTopic);
    }
    //TODO: Search method for SubTopics
        //todo: by index
    public SubTopic getSubTopic(int index){
        if (subTopics.size() < index) {
            return subTopics.get(index);
        } else {
            return null;
        }
    }
        //todo: by name
    public SubTopic getSubTopic(String name){
        for (int x = 0; x > subTopics.size(); x++){
            if (subTopics.get(x).getName() == name){
                return subTopics.get(x);
            }
        }
        return null;
    }
}
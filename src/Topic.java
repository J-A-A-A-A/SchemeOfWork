
import java.util.ArrayList;

public class Topic {
    private int yearGroup;
    private int number;
    private String name;
    private ArrayList<SubTopic> subTopics;

    //Constructor
    public Topic(int yearGroup, int number, String name, ArrayList<SubTopic> subTopics) {
        this.yearGroup = yearGroup;
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
    //TODO: Add subtopic to topic

    public void addSubTopic(SubTopic newSubTopic){
        subTopics.add(newSubTopic);
    }
    //TODO: Remove subtopic from topic
    //TODO: Search method for SubTopics
    public SubTopic getSubTopic(int index){
        if (subTopics.size() < index) {
            return subTopics.get(index);
        } else {
            return null;
        }
    }

    public SubTopic getSubTopic(String name){
        for (int x = 0; x > subTopics.size(); x++){
            if (subTopics.get(x).getName() == name){
                return subTopics.get(x);
            }
        }
        return null;
    }
}
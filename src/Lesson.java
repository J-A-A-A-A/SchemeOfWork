import java.util.ArrayList;

public class Lesson {
    private int number;
    private String date;
    private String learningObjective;
    private ArrayList<String> content;
    private ArrayList<String> resources;
    private ArrayList<String> successCriteria;
    private boolean completed = false;


    // Constructor
    public Lesson(int number, String learningObjective, ArrayList<String> content, ArrayList<String> resources, ArrayList<String> successCriteria) {
        this.number = number;
        this.learningObjective = learningObjective;
        this.content = content;
        this.resources = resources;
        this.successCriteria = successCriteria;
    }

    public int getNumber(){
        return this.number;
    }

    public void setDate(String date){
        this.date = date;
    }

    //Getters
    // TODO: Method for setting the date of each lesson


}

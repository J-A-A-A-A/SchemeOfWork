import java.util.ArrayList;

public class Lesson {
    private int number;
    private String date;
    private ArrayList<String> learningObjective;
    private ArrayList<String> successCriteria; //bullet points
    private ArrayList<String> resources; //website
    private boolean completed;
    private boolean assigned;


    // Constructor
    public Lesson(int number, ArrayList<String> learningObjective, ArrayList<String> successCriteria, ArrayList<String> resources) {
        this.number = number;
        this.learningObjective = learningObjective;
        this.successCriteria = successCriteria;
        this.resources = resources;
        this.completed = false;
        this.assigned = false;
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

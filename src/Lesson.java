import java.util.ArrayList;

public class Lesson {
    private int number;
    private String name;
    private String learningObjective;
    private ArrayList<String> content;
    private ArrayList<String> resources;
    private ArrayList<String> successCriteria;
    private boolean completed;


    // Constructor
    public Lesson(int number, String name, String learningObjective, ArrayList<String> content, ArrayList<String> resources, ArrayList<String> successCriteria) {
        this.number = number;
        this.name = name;
        this.learningObjective = learningObjective;
        this.content = content;
        this.resources = resources;
        this.successCriteria = successCriteria;
        completed = false;
    }
    //
}

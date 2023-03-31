import java.util.ArrayList;

public class Lesson {
    private int number;
    private String subject;
    private String name;
    private String learningObjective;
    private ArrayList<String> content;
    private ArrayList<String> resources;
    private ArrayList<String> successCriteria;
    private boolean completed;


    // Constructor
    public Lesson(int number, String subject, String name, String learningObjective, ArrayList<String> content, ArrayList<String> resources, ArrayList<String> successCriteria) {
        this.number = number;
        this.subject = subject;
        this.name = name;
        this.learningObjective = learningObjective;
        this.content = content;
        this.resources = resources;
        this.successCriteria = successCriteria;
        completed = false;
    }

    //Getters
    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getLearningObjective() {
        return learningObjective;
    }

    public ArrayList<String> getContent() {
        return content;
    }

    public ArrayList<String> getResources() {
        return resources;
    }

    public ArrayList<String> getSuccessCriteria() {
        return successCriteria;
    }

    public boolean isCompleted() {
        return completed;
    }
}

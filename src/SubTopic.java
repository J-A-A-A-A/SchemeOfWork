import java.util.ArrayList;

public class SubTopic {

    private int id;
    private int number;
    private String name;
    private ArrayList<Lesson> lessons;

    public SubTopic(int id, int number, String name) {
        this.id = id;
        this.number = number;
        this.name = name;
    }
    public int getNumber() {
        return this.number;
    }
    public String getName() {
        return this.name;
    }

    public void setLessons(ArrayList<Lesson> lessons) {
        this.lessons = lessons;
    }

    public int getId() {
        return id;
    }
}
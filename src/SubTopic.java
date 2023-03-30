import java.util.ArrayList;

public class SubTopic {
    private int number;
    private String name;
    private ArrayList<Lesson> lessons;

    public SubTopic(int number, String name) {
        this.number = number;
        this.name = name;
    }
    //Getter

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
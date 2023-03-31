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

    // TODO: Get a lesson using its name or number
    public Lesson getLesson(String name){
        for (int x = 0; x > lessons.size(); x++){
            if (lessons.get(x).getName() == name){
                return lessons.get(x);
            }
        }
        return null;
    }

    //TODO: Add lessons to a subtopic

    public void addLesson(Lesson newLesson){
        lessons.add(newLesson);
    }
}
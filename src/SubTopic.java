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
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    // TODO: Get a lesson using its name or number
    public Lesson getLesson(int  number){
        for (int x = 0; x > this.lessons.size(); x++){
            if (lessons.get(x).getNumber() == number){
                return lessons.get(x);
            }
        }
        return null;
    }

    //TODO: Add lessons to a subtopic

    public void addLesson(Lesson newLesson){
        this.lessons.add(newLesson);
    }
}
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {

    ResultSet query;
    public static void main(String[] args) {
       Connect connect = new Connect(); // connect to database
        try {
            // loading topics and the subtopics and lessons from the SQL database
            ArrayList<Topic> topics = connect.getTopicsFromDB();
            for (Topic topic: topics){
                ArrayList<SubTopic> subTopics = connect.getSubTopicsFromDB(topic.getID());
                for(SubTopic subTopic: subTopics){
                    ArrayList<Lesson> lessons = connect.getLessonsFromDB(subTopic.getId());
                    subTopic.setLessons(lessons);
                }
                topic.setSubtopics(subTopics);
            }


            // getting each class information and what periods in the week the class a lesson using the timetable
            ArrayList<Period> timetable = connect.getTimetableFromDB();
            ArrayList<ClassGroup> classes = new ArrayList<>();
            ArrayList<String> classCodes = new ArrayList<>();


            for(Period period: timetable){
                // finding new classes from timetable
                if(!(classCodes.contains(period.getClassCode())) && period.getClassCode() != null){
                    classCodes.add(period.getClassCode());
                    ArrayList<Integer> periodNumbers = new ArrayList<Integer>();
                    // getting period of each class and creating a new classGroup object
                    for(Period period2: timetable){
                        if(period2.getClassCode() != null && period2.getClassCode().equals(period.getClassCode())){
                            periodNumbers.add(timetable.indexOf(period2));
                        }
                    }
                    ClassGroup classGroup = new ClassGroup(period.getClassCode(),period.getYear(), period.getSubject(),periodNumbers);
                    // adding the topics that each class needs
                    for (Topic topic: topics){
                        if(classGroup.getYear() == topic.getYearGroup() && classGroup.getSubject().equals(topic.getSubject())){
                            classGroup.addTopic(topic);
                        }
                    }
                    // assigning it to the classGroup object
                    classes.add(classGroup);
                }
            }
            System.out.println();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("result out successfully");
    }
}
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Connect {

    Connection conn = null;
    Statement statement;

    public Connect(){
        this.conn = null;
        this.statement = null;
    }
    private void connect() throws SQLException {

        try {
            this.conn = DriverManager.getConnection("jdbc:sqlite:/Users/jat/Desktop/scheme.db");
            this.statement = conn.createStatement();
            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
    }

    public ArrayList<Topic> getTopicsFromDB() throws SQLException {
        if (this.conn == null || this.statement == null ){
            connect();
        }
        ResultSet query =  this.statement.executeQuery("select * from topic");
        ArrayList<Topic> topics = new ArrayList<>();
        while(query.next())  {
            Topic topic = new Topic(
                    Integer.parseInt(query.getString("ID")),
                    Integer.parseInt(query.getString("yearGroup")),
                    query.getString("subject"),
                    Integer.parseInt(query.getString("number")),
                    query.getString("name")
            );
            topics.add(topic);
        }
        return topics;
    }

    public ArrayList<SubTopic> getSubTopicsFromDB(int topicId) throws SQLException {
        if (this.conn == null || this.statement == null ){
            connect();
        }
        ResultSet query =  this.statement.executeQuery("select * from Subtopic where topicID = " + topicId);
        ArrayList<SubTopic> subTopics = new ArrayList<>();
        while(query.next())  {
            SubTopic subTopic = new SubTopic(
                    Integer.parseInt(query.getString("ID")),
                    Integer.parseInt(query.getString("number")),
                    query.getString("name")

            );
            subTopics.add(subTopic);
        }
        return subTopics;
    }

    public ArrayList<Lesson> getLessonsFromDB(int subTopicId) throws SQLException {
        if (this.conn == null || this.statement == null ){
            connect();
        }
        ResultSet query =  this.statement.executeQuery("select * from Lessons where subtopicID = " + subTopicId);
        ArrayList<Lesson> lessons = new ArrayList<>();
        while(query.next())  {
            Lesson lesson = new Lesson(
                    Integer.parseInt(query.getString("number")),
                    new ArrayList<>(Arrays.asList(query.getString("learningObjectives").split("#"))),
                    new ArrayList<>(Arrays.asList(query.getString("successCriteria").split("#"))),
                    new ArrayList<>(Arrays.asList(query.getString("resources").split("#")))

            );
            lessons.add(lesson);
        }
        return lessons;
    }

    public ArrayList<Period> getTimetableFromDB() throws SQLException{
        if (this.conn == null || this.statement == null ){
            connect();
        }
        ArrayList<Period> timetable = new ArrayList<>();
        String[] daysOfWeek = {"mondayA","tuesdayA","wednesdayA","thursdayA","fridayA","mondayB","tuesdayB","wednesdayB","thursdayB","fridayB"};
        for(String dayOfWeek: daysOfWeek) {
            for (int number = 1; number < 8; number++) {
                ResultSet query = this.statement.executeQuery("select " + dayOfWeek + " from Timetable where period = " + number);
                while (query.next()) {
                    Period period;
                    if(query.getString(dayOfWeek) != null) {
                        String[] info = query.getString(dayOfWeek).split("#");
                        period = new Period(
                                dayOfWeek,
                                number,
                                Integer.parseInt(info[0]),
                                info[1],
                                info[2]
                        );
                    } else {
                        period = new Period(
                                dayOfWeek,
                                number,
                                0,
                                null,
                                null);
                    }
                    timetable.add(period);
                }
            }
        }
        return timetable;
    }


}

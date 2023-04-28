import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Topic currentTopic = new Topic(0,"",0,"");

        System.out.println("Year Group: ");
        currentTopic.setYearGroup(scanner.nextInt());
        System.out.println("Subject: ");
        currentTopic.setSubject(scanner.nextLine());
        System.out.println("Year Group: ");
        currentTopic.setNumber(scanner.nextInt());
        System.out.println("Topic Name: ");
        currentTopic.setName(scanner.nextLine());
        FileHandler.writeToFile("listOfTopics.txt",currentTopic.getName()+".txt",true);
    }
}
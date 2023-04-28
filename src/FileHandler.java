import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandler {

    public static void writeToFile(String fileName, String text, boolean append) {
        // write text to fileName
        // either overwriting (append = false)
        // or appending (append = true)
        // using all the exception handling best practices

        try (PrintWriter pr = new PrintWriter(new FileWriter(fileName, append))) {
            pr.println(text);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

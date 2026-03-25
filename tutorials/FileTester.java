import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTester {
    public static void main(String[] args) {
        File file = new File("Exercise1.txt");
        try {
            boolean file_created = file.createNewFile();
            if (file_created) {
                FileWriter writer = new FileWriter("Exercise1.txt");
                writer.write("This is my first file.");
                writer.close();
            }
        } catch (IOException ex) {
            System.out.println("ERROR: File could not be created.");
        }
    }
}
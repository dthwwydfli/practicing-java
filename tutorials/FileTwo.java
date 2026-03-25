import java.io.File;
import java.io.FileNotFoundException; // Add this
import java.util.Scanner;

public class FileTwo {
    public static void main(String[] args) {
        File file = new File("Exercise1.txt");
        try {
            Scanner file_reader = new Scanner(file);
            while (file_reader.hasNextLine()) {
                String text = file_reader.nextLine();
                System.out.println(text);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found!");
        }
    }
}

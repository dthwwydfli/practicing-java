import java.io.FileWriter;
import java.io.IOException;

public class SaveArray {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Exercise3.txt");
            double[] array = { 1.3, 5.6, 2.3, 9.0 };
            for (int i = 0; i < array.length; i++) {
                writer.write(array[i] + " ");
            }
            writer.close();
        } catch (IOException ex) {
            System.out.println("ERROR: File could not be created.");
        }
    }
}

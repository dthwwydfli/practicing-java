import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SavingArray {
    public static void main(String[] args) {
        double[] array = readArray("../week9_ex3/Exercise3.txt");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static double[] readArray(String filename) {
        double[] array = new double[4];
        try {
            File file = new File(filename);
            Scanner file_reader = new Scanner(file);
            int index = 0;
            while (file_reader.hasNextDouble()) {
                double number = file_reader.nextDouble();
                array[index] = number;
                index++;
            }
            file_reader.close();
        } catch (IOException ex) {
            System.out.println("ERROR: File could not be opened.");
        }
        return array;
    }
}
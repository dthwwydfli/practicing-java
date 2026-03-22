import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        double[] array = new double[10];
        Scanner input = new Scanner(System.in);
        double sum = 0;

        System.out.println("Enter your ten marks: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
            sum += array[i];
        }

        System.out.println("The marks are:");
        for (double elem : array) {
            System.out.println(elem);
        }

        double average = sum / array.length;
        System.out.println("The average is: " + average);

    }

}

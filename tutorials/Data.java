import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        double first_number = input.nextDouble();
        System.out.println("Enter another number:");
        double second_number = input.nextDouble();
        double sum = first_number + second_number;
        System.out.println("The sum of the numbers is: " + sum);
    }
}

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("**********\n   MENU   \n**********");
            System.out.println("1.- Addition");
            System.out.println("0.- Quit");
            System.out.print("Please select an option: ");
            
            choice = input.nextInt();

            if (choice == 1) {
                addition();
            }
        }
        System.out.println("Program ended.");
    }

    public static void addition() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        
        double sum = num1 + num2;
        System.out.println("The result is: " + sum);
    }
}
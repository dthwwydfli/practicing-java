import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("Over 18");
        } else if (age<0) {
            System.out.println("Invalid number entered");
        } else {
            System.out.println ("Under 18");
        }

    }

}

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        countDown(number);
    }

    public static void countDown(int n) {
        System.out.print(n + " ");

        if (n > 0) {
            countDown(n - 1);
        }
    }
}
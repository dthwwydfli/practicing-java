import java.util.Scanner;

public class Factorial {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = input.nextInt();
        int factorial = 1;

        for (int i=number; i>=1; i--) {
            factorial = factorial * 1;
        } System.out.println("Factorial: " +factorial);
    }
    
}

import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the base number: ");
        int base = input.nextInt();
        
        System.out.print("Enter the exponent: ");
        int exp = input.nextInt();

        int result = power(base, exp);
        System.out.println("Result: " + result);
    }

    public static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else {
            return base * power(base, exp - 1);
        }
    }
}
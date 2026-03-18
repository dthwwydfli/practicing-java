import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        int passcode = 486251;
        Scanner input = new Scanner(System.in);
        int code;
        int attempts = 0;

        while (attempts < 4) {
            System.out.println("Enter your passcode: ");
            code = input.nextInt();
            
            if (code == passcode) {
                System.out.println("Passcode is correct");
                break;
            } else {
                System.out.println("Passcode incorrect");
            }
            attempts++;

        }
    }
}

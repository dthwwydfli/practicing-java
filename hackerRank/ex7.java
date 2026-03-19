import java.util.*;
import java.io.*;

public class ex7 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int currentSum = a;
            for (int j = 0; j < n; j++) {

                // Math.pow returns a double, so we cast to int
                // 2^j * b
                currentSum += (int) Math.pow(2, j) * b;

                System.out.print(currentSum + " ");
            }

            System.out.println();
        }
        in.close();

    }
}

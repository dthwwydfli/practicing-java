import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args){
        double[][] marks = new double[5][3];
        Scanner input = new Scanner(System.in);
        

        for (int i = 0; i < marks.length; i++){
            System.out.println("Enter three makrs for student " +(i+1)+ ":");
            double studentSum = 0;

            for (int j = 0; j < marks[i].length; j++) {
                marks[i][j] = input.nextDouble();
                studentSum += marks[i][j];
            }

            double average = studentSum / marks[i].length;
            System.out.println("Average for student " + (i + 1) + " is: " + average);
            System.out.println("---");
        }

    }
    
}

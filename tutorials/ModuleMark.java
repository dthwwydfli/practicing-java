import java.util.Scanner;

public class ModuleMark {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ict mark: ");
        double ict = input.nextDouble();
        System.out.println("Enter lab-marks: ");
        double lba = input.nextDouble();
        

        if (ict >=30 && lba>=30){
            double finalMark = (ict + lba )/2;
            System.out.println("You passed, your total mark is: "+finalMark);
            if (finalMark>=40){
                System.out.println("You passed this module");
            } else{
                System.out.println("You failed");
            }
        } else{
            System.out.println("You failed one of the modules");
        }

    }
}

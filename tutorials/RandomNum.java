import java.util.Scanner;
import java.util.Random;

public class RandomNum {

    public static void main (String[] args){
        Random randomGenerator = new Random();
        int hidden = (int) randomGenerator.nextInt(20)+1;
        System.out.println("Guess the hidden number between 1 and 20: ");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();

        while (guess != hidden){
            System.out.println("You guessed wrong, try again: ");
            guess = input.nextInt();
        } 
        System.out.println("You entered " +guess+ " and the number was " +hidden);


    }
    
}

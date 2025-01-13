
import java.util.Random;
import java.util.Scanner;


public class GuessTheNumber {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner keyboard = new Scanner(System.in);
        int count=1;
        int input;
        int randomNumber= random.nextInt(100) +1;

        System.out.print("Enter your integer guess: " + "\t");
        input = keyboard.nextInt();
        while (input!= randomNumber) {

            if ((input > 100) || (input <1)) {
                System.out.println("That was a wasted guess!, Pick a number between 1 and 100, inclusive!");
            } else if (input > randomNumber) {
                System.out.println("Your guess was too HIGH, keep trying");
            } else if (input < randomNumber) {
                System.out.println("Your guess was too LOW, keep trying");
            }
            System.out.print("Enter your integer guess: " +"\t");
            input = keyboard.nextInt();
            count++;

        }
        if (input == randomNumber) {
            System.out.print("Congratulation! You guesses the number in "+count+ " guesses! Thanks for playing"+ "\t");
        }
    }
}

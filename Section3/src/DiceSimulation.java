import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) {
        int count=0;
        Random random = new Random();
        int randomNumber;
        while (count< 9){
            randomNumber= random.nextInt(5) +1;
            System.out.println("Random cube number is: "+ randomNumber);
            count++;
        }
    }
}

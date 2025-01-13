import java.sql.SQLOutput;
import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int sum;
        int number;

        System.out.println("Enter a positive value to continue SumFunction");
        System.out.println("Or enter an negative value to exist " );
        number = keyboard.nextInt();
        sum = 0;

        while (number >= 0){
            sum = sum +number;
            System.out.println("Enter a positive value to continue SumFunction");
            System.out.println("Or enter an negative value to exist");
            number = keyboard.nextInt();

        }
        System.out.println("Done!");
        System.out.println("The total value of the numbers is: "+sum);
    }
}

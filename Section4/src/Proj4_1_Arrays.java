
import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        int result =0;
        int[] myList = new int[5];

        for(int i=0; i< myList.length; i++) {
            System.out.print("Please enter an integer: \t ");
            myList[i] = keyboard.nextInt();

        } //endFor

        for (int i=0; i< myList.length; i++){
            result = myList[i] * 2;
            System.out.println("result is "+ result);

        } // end for

    } //endMain
}

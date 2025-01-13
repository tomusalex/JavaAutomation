import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {
    public static void main(String[] args) {
        try {
            Scanner inFile = new Scanner(new File("nums.txt"));
            PrintWriter pw = new PrintWriter("twice_nums.txt");
            int tempNum;
//            int tempTwiceNum =0;
            while (inFile.hasNext()) {
                tempNum = inFile.nextInt();
//                tempTwiceNum = tempNum *2;
                pw.println(tempNum*2);
            }
            pw.close();
            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } // end try-catch
    } // end main

} // end TwiceData

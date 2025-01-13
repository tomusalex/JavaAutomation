import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestFileImput {
    public static void main(String[] args) {
        int sum =0;
        try {
            Scanner inFile = new Scanner(new File("input.txt"));
            int imput;

            while (inFile.hasNext()) {
                imput = inFile.nextInt();
                sum += imput;
                System.out.println(imput);
            }
            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Can't find file!");
            System.out.println(e.getMessage());
        }
            catch (InputMismatchException e) {
                System.out.println("Error reading file");
            } // end try/catch
        System.out.println("Sum is:"+sum);
    } // end main
} // end TestClassImput


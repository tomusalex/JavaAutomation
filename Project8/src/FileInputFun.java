import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FileInputFun {
    public static void main(String[] args) {
        Scanner infile;
        try {
            infile = new Scanner(new File("input.txt"));
            int input;
            while (infile.hasNext()) {
                input = infile.nextInt();
                System.out.println(input);
            } // end while
            infile.close();

        } catch (FileNotFoundException e) {
            System.out.println("Can't find file!");
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error reading data!");
        }

    } // end main
} // end class

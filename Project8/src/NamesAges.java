import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;



public class NamesAges {
    public static void main(String[] args) {
       try{

           Scanner namesFile = new Scanner(new File("students_names.txt"));
           Scanner agesFile = new Scanner(new File("students_ages.txt"));
           PrintWriter pw = new PrintWriter("names_ages.txt");
           String tempName;
           int tempAge;
           while (namesFile.hasNext() && (agesFile.hasNext())){
               tempName = namesFile.nextLine();
               tempAge = agesFile.nextInt();
               pw.println(tempName+ " is "+tempAge + " years old");
           }
           pw.close();
       }
       catch (FileNotFoundException e) {
           System.out.println(e.getMessage());
       }// end try-catch
       } // end main

    } // end NamesAges



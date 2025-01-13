import java.util.ArrayList;
import java.util.Scanner;

public class Proj5_1_NamePermutation {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String fullName;
        String value;
        int position;
        ArrayList<String> firstNameList = new ArrayList<String>();
        ArrayList<String> lastNameList = new ArrayList<String>();

        for (int i=0; i<=4; i++){
            position= i+1;
            System.out.print("Enter the full name "+position+" :\t");
            fullName=keyboard.nextLine();
            int idx = fullName.lastIndexOf(' ');
            value = fullName.substring(0, idx);
            firstNameList.add(value);
            value = fullName.substring( idx+1);
            lastNameList.add(value);
        } //endFor

        for (int i=0; i<=4; i++ ) {
            for (int ii=0; ii<=4; ii++ ) {
                System.out.println(firstNameList.get(i) + " "+lastNameList.get(ii));
            } // endFor
            } // endFor
    } // endMain
}

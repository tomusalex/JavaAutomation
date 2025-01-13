import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

public class ArrayListFun {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int random;
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("John");
        namesList.add("Kyle");
        namesList.add("Matthew");
        namesList.add("Amanda");
        namesList.add("Wendy");

        ArrayList<Integer> gradeList = new ArrayList<>();
        gradeList.add(8);
        gradeList.add(7);
        gradeList.add(7);
        gradeList.add(5);
        gradeList.add(9);

        for(int i=0; i<namesList.size(); i++){
            random = randomNumber.nextInt(11) +1;
            System.out.println(namesList.get(i) + " obtained grade " + random);
        }
//        for (String name : namesList) {
//            System.out.println(name);
//        }
    } //end main
}

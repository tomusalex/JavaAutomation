
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<>();
        names.add("John Doe");
        names.add("Michael Obama");
        names.add("Barak Obama");
        names.add("Joe Biden");
        names.add("Donald Trump");
        try {
            PrintWriter pw = new PrintWriter("names2.txt");
//            for (String name :names)
//               pw.println(names);
            for (int i=0; i<names.size(); i++){
                pw.println(names.get(i));
            }
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Can't find file!");
            System.out.println(e.getMessage());
        }

    }
}

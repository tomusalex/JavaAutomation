import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;

        System.out.print("Enter the first and last name: \t");
        name = keyboard.nextLine();
        int idx = name.lastIndexOf(' ');
        if (idx == -1)
            throw new IllegalArgumentException("Only a single name: " + name);
        String firstName = name.substring(0, idx);
        String lastName  = name.substring(idx + 1);

        System.out.println("Fist name is: "+firstName+ " and the last name is : "+lastName);
        System.out.println("uppercase version of the first name is :" + firstName.toUpperCase());
        System.out.println("lowercase version of the last name name is :" + lastName.toLowerCase());
    }
}

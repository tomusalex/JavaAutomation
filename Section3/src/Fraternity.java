import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String gender;
        int age;

        System.out.print("Please enter the age: \t");
        age = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Please enter the gender (M/F): \t");
        gender = keyboard.nextLine().toUpperCase();

        if (age >= 19) {
            if (gender.equals("M")) {
                System.out.println("You are eligible to join the fraternity");
            } else {
                System.out.println("You are NOT a male, NOT eligible");
            }
        } else {
            System.out.println("Don't have the legal age to join the Fraternity, NOT eligible");
        }
    }
}



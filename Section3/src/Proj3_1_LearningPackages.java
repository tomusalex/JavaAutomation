import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int packageNumber;
        int coursesEnrolled;
        int totalCostPackage;
        int extraCourses =0;
        int totalCost = 0;

        System.out.print("Which of the packages do you want? : " + "\t");
        packageNumber=keyboard.nextInt();
        keyboard.nextLine();
//        System.out.println(packageNumber);
        System.out.print("How many courses did you enroll in this month? : " + "\t");
        coursesEnrolled=keyboard.nextInt();
//        System.out.println(coursesEnrolled);

        switch (packageNumber) {
            case 1:
                if (coursesEnrolled>2){
                    extraCourses = (coursesEnrolled-2);
                    totalCost = 10 + (extraCourses * 6);
                    break;
                } else {
                    totalCost = 10;
                    break;
                }
            case 2:
                if (coursesEnrolled>4){
                    extraCourses = (coursesEnrolled-4);
                    totalCost = 12 + (extraCourses * 4);
                    break;
                } else {
                    totalCost = 12;
                    break;
                }
            case 3:
                if (coursesEnrolled>6){
                    extraCourses = (coursesEnrolled-6);
                    totalCost = 15 + (extraCourses * 3);
                    break;
                } else {
                    totalCost = 15;
                    break;
                }
        }
        System.out.println("Extra course are: "+extraCourses);
        System.out.println("Total cost is $"+totalCost);

    }
}

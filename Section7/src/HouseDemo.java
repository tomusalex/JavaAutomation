public class HouseDemo {
    public static void main(String[] args) {
        House myHouse = new House();
        House yourHouse = new House();

        myHouse.setNumStories(3);
        myHouse.setNumWindows(4);
        myHouse.setColor("blue");

        printHouseData(myHouse);
//        yourHouse.setNumStories(5);
//        yourHouse.setNumWindows(6);
//        yourHouse.setColor("red");

//        System.out.println("My house has " + myHouse.getNumStories() + " floors, has " +
//                myHouse.getNumWindows() + " windows and is " + myHouse.getColor());
//        System.out.println();
//        System.out.println("Your house has " + yourHouse.getNumStories() + " floors, has " +
//                yourHouse.getNumWindows() + " windows and is " + yourHouse.getColor());

    }

    public static void printHouseData(House house) {
        System.out.println("The house is " + house.getColor() + ","+
                " \nhas " + house.getNumStories() + " stories and " + house.getNumWindows()
                + " windows." );
    }
}

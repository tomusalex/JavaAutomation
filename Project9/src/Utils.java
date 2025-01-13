
public class Utils {
    public static void printAnimal(Animal animal){
        System.out.println("Name: " + animal.getName());
        System.out.println("Weight: " + animal.getWeight());
        System.out.println("Animal says: " + animal.makeNoise());
        System.out.println();
    }
    public static void printCat(Cat animal){
        System.out.println("Name: " + animal.getName());
        System.out.println("Weight: " + animal.getWeight());
        System.out.println("Rase: " + animal.getRase());
        System.out.println("Animal says: " + animal.makeNoise());
        System.out.println();
    }

}

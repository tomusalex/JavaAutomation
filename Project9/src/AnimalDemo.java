import jdk.jshell.execution.Util;

public class AnimalDemo {

    public static void main(String[] args) {
        Animal myAnimal = new Animal("Fido", 80.65);
        Utils.printAnimal(myAnimal);

        Dog myDog = new Dog("Azorel",34.87);
        Utils.printAnimal(myDog);

        Cat myCat = new Cat("Pisi", 5.89, "O rasa");
        Utils.printCat(myCat);

        Animal temp = new Dog("Bob", 34.23);


    }

}

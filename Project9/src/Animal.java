
public abstract class Animal {
    String name;
    double weight;

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract String makeNoise();

    public void printAnimal(Animal animal) {
        System.out.println("Name: " + animal.getName());
        System.out.println("Weight: " + animal.getWeight());
        System.out.println("Animal says: " + animal.makeNoise());

    }
}
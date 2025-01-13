public class Dog extends Animal {
    public Dog(String name, double weight) {
        super(name, weight);
    } // end ctor

    @Override
    public String makeNoise(){
        return "Woof!";
    }

}


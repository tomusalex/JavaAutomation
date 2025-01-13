public class Cat extends Animal implements IMoveble {
    String rase;
    public Cat(String name, double weight, String rase) {
        super(name, weight);

        this.rase = rase;
    } // end ctor
    public String getRase(){
        return rase;
    }
    public void setRase(String rase){
        this.rase=rase;
    }
 
    @Override
    public  String move();
        return "I'm wagging my tail and running!";




}

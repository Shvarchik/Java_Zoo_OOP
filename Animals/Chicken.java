package Animals;

public class Chicken extends Bird{
    
    public Chicken (int height, int weight,  String eyeColor, String color, double heightOfFly) {
        super (height, weight, eyeColor, color, heightOfFly);
    }
    
    @Override
    public void makeSound() {
        System.out.println("кудах-тах-тах");
    }

    @Override
    public String printInfo(){
        return String.format("Курица %s", super.printInfo());
    }
}

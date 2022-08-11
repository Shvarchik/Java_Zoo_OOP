package Animals;

public class Chicken extends Bird{
    
    public Chicken (int height, int weight,  String eyeColor, String color, int heightOfFly) {
        super (height, weight, eyeColor, color, heightOfFly);
    }
    
    @Override
    public void MakeSound() {
        System.out.println("кудах-тах-тах");
    }

    @Override
    public void Fly() {
        System.out.println(String.format("%s %d", "лечу на бреющем полете, высота",this.heightOfFlight));
    }
}

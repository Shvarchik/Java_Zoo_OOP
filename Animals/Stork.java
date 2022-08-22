package Animals;

public class Stork extends Bird{
    public Stork (int height, int weight, String eyeColor, String color, double heightOfFlight){
        super(height, weight, eyeColor, color, heightOfFlight);     
    }

    @Override
    public void makeSound() {
        System.out.println("тук-тук-тук");
    }
}
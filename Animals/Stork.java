package Animals;

public class Stork extends Bird{
    public Stork (int height, int weight, String eyeColor, String color, int heightOfFlight){
        super(height, weight, eyeColor, color, heightOfFlight);     
    }

    @Override
    public void MakeSound() {
        System.out.println("тук-тук-тук");
    }
}
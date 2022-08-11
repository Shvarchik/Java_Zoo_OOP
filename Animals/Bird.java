package Animals;

public abstract class Bird extends Animal{

    int heightOfFlight;

    public Bird(int height, int weight, String eyeColor, String color, int heightOfFlight){
        super(height, weight, eyeColor, color);
        this.heightOfFlight = heightOfFlight;
    }

    @Override
    public abstract void MakeSound();

    public void Fly(){
        System.out.println("Я лечу на высоте" + this.heightOfFlight);
    }

    public String printInfo(){
        return String.format("%s\nheight of fly: %d", super.printInfo(), this.heightOfFlight);
    }

}

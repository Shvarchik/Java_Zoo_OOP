package Model;

public class Tiger extends WildAnimal{
    
    public Tiger (int height,  int weight, String eyeColor, String color, String lifeArea, String dateOfFound){
        super(height, weight, eyeColor, color, lifeArea, dateOfFound);
    }

    @Override
    public void makeSound(){
        System.out.println("Рычу - РРРРРРР");
    }

    @Override
    public String printInfo (){
        return String.format("Тигр: %s", super.printInfo());
    }
}
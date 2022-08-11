package Animals;

public class Dog extends HomeAnimal {
    
    Boolean trained;
    public Dog(int height, int weight, String eyeColor, String name, String breed, Boolean vaccinated, String color, String dateOfBirth, Boolean trained){
        super(height, weight, eyeColor, name, breed, vaccinated, color, dateOfBirth);
        this.trained = trained;
    }

    @Override
    public void MakeSound(){
        System.out.println("Woof!");
    }
    
    public void love(){
        System.out.println("I love you");
    }

    public void training(){
        trained = true;
    }
    @Override
    public String printInfo(){
        return String.format("%s\ntrained: ", super.printInfo(), this.trained);
    }
}

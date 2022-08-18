package Animals;

public class Dog extends HomeAnimal {
    
    private Boolean trained;

    public Dog(int height, int weight, String eyeColor, String name, String breed, Boolean vaccinated, String color, String dateOfBirth, Boolean trained){
        super(name, breed, height, weight, eyeColor, color, dateOfBirth, vaccinated);
        this.trained = trained;
    }

    @Override
    public void MakeSound(){
        System.out.println("Woof!");
    }
    
    public void love(){
        System.out.println("I love you, Woof!");
    }

    public void training(){
        trained = true;
    }
    public Boolean getTrained (){
        return trained;
    }

    @Override
    public String printInfo(){
        return String.format("%s\ntrained: ", super.printInfo(), this.trained);
    }
}

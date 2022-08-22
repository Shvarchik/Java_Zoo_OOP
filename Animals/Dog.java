package Animals;

public class Dog extends HomeAnimal {
    
    private Boolean trained;

    public Dog(int height, int weight, String eyeColor, String name, String breed, Boolean vaccinated, String color, String dateOfBirth, Boolean trained){
        super(name, breed, height, weight, eyeColor, color, dateOfBirth, vaccinated);
        this.trained = trained;
    }

    @Override
    public void makeSound(){
        System.out.println("Гав-гав!");
    }
    
    public void love(){
        System.out.println("Я тебя люблю, гав!");
    }

    public void getTrained(){
        trained = true;
    }
    public void training (String name){
        System.out.println(String.format("%s : Я учусь ходить на задних лапах, гав", this.name));
        this.trained = true;
    }

    @Override
    public String printInfo(){
        return String.format("Собака %s, trained: %b ", super.printInfo(), this.trained);
    }
}

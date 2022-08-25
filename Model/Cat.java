package Model;

public class Cat extends HomeAnimal {

    private Boolean presenceOfWool;

    public Cat (String name, String breed, String color, 
        int height, int weight, String eyeColor, Boolean vaccinated, String dateOfBirth, Boolean presenceOfWool) {
        super (name, breed, height, weight, eyeColor, color, dateOfBirth, vaccinated);
        this.presenceOfWool=presenceOfWool;
    }

    @Override
    public void makeSound(){
        System.out.println("Miiiayyyy");
    }

    @Override
    public void love() {
        System.out.println("I love you, miiiayyy");;
    }
    public Boolean getPresenceofWool (){
        return presenceOfWool;
    }
    @Override
    public String printInfo(){
        return String.format("Cat: %s, presenceOfWool %b ", super.printInfo(), this.presenceOfWool);
    }
}


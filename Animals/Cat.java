package Animals;

public class Cat extends HomeAnimal {

    private Boolean presenceOfWool;

    public Cat(String name, String breed, int height, int weight, String eyesColor, String color, Boolean presenceOfWool, String dateOfBirth, Boolean vaccinated) {
        super(name, breed, height, weight, eyesColor, color, dateOfBirth, vaccinated);
        this.presenceOfWool = presenceOfWool;
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
}


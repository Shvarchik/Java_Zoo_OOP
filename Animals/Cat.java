package Animals;

public class Cat extends HomeAnimal {

    public Cat(int height, int weight, String eyesColor, String color, String dateOfBirth, Boolean vaccinated, String name, String breed) {
        super(height, weight, eyesColor, color, dateOfBirth, vaccinated, name, breed);
    }

    @Override
    public void MakeSound(){
        System.out.println("Miiiayyyy");
    }

    @Override
    public void love() {
        System.out.println("I love you, miiiayyy");;
    }
}


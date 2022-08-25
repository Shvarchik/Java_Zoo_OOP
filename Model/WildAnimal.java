// Абстрактный класс Дикое животное со следующими свойствами:
// 2.1 Место обитания
// 2.2 Дата нахождения

package Model;

public abstract class WildAnimal extends Animal {

    protected String lifeArea;
    private String dateOfFound;

    protected WildAnimal(int height, int weight, String eyeColor, String color, String lifeArea, String dateOfFound) {
        super.height=height;
        super.weight=weight;
        super.color=color;
        super.eyeColor=eyeColor;
        this.lifeArea = lifeArea;
        this.dateOfFound = dateOfFound;
    }

    @Override
    public abstract void makeSound();

    @Override
    public String printInfo() {
        return String.format("%s, %s, %s", super.printInfo(), this.lifeArea, this.dateOfFound);
    }
}
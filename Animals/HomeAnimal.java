// абстрактный класс, реализующий интерфейс Животное:
// 1.Домашнее животное со следующими свойствами:
// 1.1 Кличка
// 1.2 Порода
// 1.3 Наличие прививок
// 1.4 Цвет шерсти
// 1.5 Дата рождения
// И методами:
// 1.5 Проявлять ласку

package Animals;

public abstract class HomeAnimal extends Animal {
    String dateOfBirth;
    Boolean vaccinated;
    String name;
    String breed;

    public HomeAnimal(String name,String breed, int height, int weight, String eyesColor, String color, String dateOfBirth, 
    Boolean vaccinated){
        super(height, weight, eyesColor, eyesColor);
        this.dateOfBirth = dateOfBirth;
        this.vaccinated = vaccinated;
        this.name = name;
        this.breed = breed;
    }
    
    public void love(){
        System.out.println("I love you");
    }
    
    @Override
    public abstract void makeSound();

    @Override
    public String printInfo(){
        return String.format("name: %s, breed: %s, %s, dateOfBirth: %s, vaccinated: %b", 
        this.name, this.breed, super.printInfo(), this.dateOfBirth, this.vaccinated);
    }
}

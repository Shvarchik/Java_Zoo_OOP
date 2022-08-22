import Animals.*;

public class Program {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        Chicken chicken1 = new Chicken(30,3,"black","White",0.3);
        zoo.addAnimal(chicken1);
        Wolf wolf1 = new Wolf(100,60,"Black","Grey", "Восточная Сибирь", "11.08.2022", "вожак");
        Dog dog1 = new Dog(100, 40, "Brown", "Полкан", "овчарка", true, "черно-белый", "11.03.2005", true);
        zoo.addAnimal(wolf1);
        zoo.addAnimal(dog1);
        
        System.out.println(zoo.getInfoAnimal(1));
        chicken1.Fly();
        zoo.printZooList();
        zoo.makeSound(2);
        zoo.printZooList();
        zoo.zooSound();
        zoo.removeAnimal(1);
        zoo.printZooList();
    }
}

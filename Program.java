import Model.*;
import View.MenuEntrance;

public class Program {
    public static void main(String[] args) throws Exception {

        Zoo zoo = new Zoo();
        Chicken chicken1 = new Chicken(30,3,"black","White",0.3);
        zoo.addAnimal(chicken1);
        Wolf wolf1 = new Wolf(100,60,"Black","Grey", "Восточная Сибирь", "11.08.2022", "вожак");
        Animal dog1 = new Dog("Полкан", "овчарка","черно-белый", 100, 40, "Brown", true, "11.03.2005", true);
        zoo.addAnimal(wolf1);
        zoo.addAnimal(dog1);
        
        // System.out.println(zoo.getInfoAnimal(1));
        // chicken1.Fly();
        // zoo.printZooList();
        // zoo.makeSound(2);
        // zoo.printZooList();
        // zoo.soundAll();
        // zoo.removeAnimal(1);
        // zoo.printZooList();
        new MenuEntrance(zoo).start();
    }
}

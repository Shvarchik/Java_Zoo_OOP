import Animals.*;

public class Program {
    public static void main(String[] args) {
       Chicken chicken = new Chicken(30,3,"black","White",15);
       chicken.Fly();
       chicken.MakeSound();
       Wolf wolf = new Wolf(100,60,"Black","Grey", "Восточная Сибирь", "11.08.2022", "вожак");
       
    }
}

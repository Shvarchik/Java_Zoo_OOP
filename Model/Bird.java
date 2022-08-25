// абстрактный класс "Птица", реализующий интерфейс животное, у которого будет защищённое поле:
// 1.Высота полёта
// и метод:
// 2. Летать, выводящий на экран фразу "Я лечу на x метрах, где x - высота полёта
// и защищённый конструктор, принимающий высоту полёта  

package Model;

public abstract class Bird extends Animal{

    private double heightOfFlight;

    protected Bird(int height, int weight, String eyeColor, String color, double heightOfFlight){
        super.height=height;
        super.weight=weight;
        super.color=color;
        super.eyeColor=eyeColor;
        this.heightOfFlight = heightOfFlight;
    }

    @Override
    public abstract void makeSound();

    public void Fly(){
        System.out.println(String.format("Я лечу на высоте %.1f метров", this.heightOfFlight));
    }

    public String printInfo(){
        return String.format("%s, height of fly: %.1f", super.printInfo(), this.heightOfFlight);
    }
}

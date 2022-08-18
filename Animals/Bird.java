// абстрактный класс "Птица", реализующий интерфейс животное, у которого будет защищённое поле:
// 1.Высота полёта
// и метод:
// 2. Летать, выводящий на экран фразу "Я лечу на x метрах, где x - высота полёта
// и защищённый конструктор, принимающий высоту полёта  

package Animals;

public abstract class Bird extends Animal{

    private int heightOfFlight;

    protected Bird(int height, int weight, String eyeColor, String color, int heightOfFlight){
        super(height, weight, eyeColor, color);
        this.heightOfFlight = heightOfFlight;
        
    }

    @Override
    public abstract void MakeSound();

    public void Fly(){
        System.out.println(String.format("Я лечу на высоте %d метров", this.heightOfFlight));
    }

    public String printInfo(){
        return String.format("%s\nheight of fly: %d", super.printInfo(), this.heightOfFlight);
    }
}

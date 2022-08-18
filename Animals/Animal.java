// реализовать абстрактный класс "Животное" со следующими полями:
// 1.Рост животного
// 2.Вес животного
// 3.Цвет глаз животного
// И методы:
// 1.Издать звук
// 2.Напечатать информацию о животном

package Animals;

public abstract class Animal {
    int height;
    int weight;
    String eyesColor;
    String color;

    public Animal(int height, int weight, String eyesColor, String color){
        this.height = height;
        this.weight = weight;
        this.eyesColor = eyesColor;
        this.color = color;
    }

    public abstract void MakeSound();

    public String printInfo(){
        return String.format("%d: height, %d: weight, %s: eyesColor, %s: color", height, weight, eyesColor, color);
    }
}


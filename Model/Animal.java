// реализовать абстрактный класс "Животное" со следующими полями:
// 1.Рост животного
// 2.Вес животного
// 3.Цвет глаз животного
// И методы:
// 1.Издать звук
// 2.Напечатать информацию о животном

package Model;

public abstract class Animal {
    int height;
    int weight;
    String eyeColor;
    String color;

    public abstract void makeSound();

    public String printInfo(){
        return String.format("рост: %d, вес: %d, цвет глаз: %s, окрас: %s", height, weight, eyeColor, color);
    }
}


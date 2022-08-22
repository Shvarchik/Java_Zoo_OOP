// реализовать класс "Зоопарк", в котором будет храниться любая структура данных животных(массив, стек, очередь),
// в котором организовать приватный массив объектов-животных со следующими методами:
// 1.Добавить животное в зоопарк(добавляет новое животное в структуру данных,
//   для массива использовать следующий алгоритм https://gospodaretsva.com/urok-27-vstavka-elementov-v-massiv.html,
//   для стека и очереди вы алгоритмы уже знаете)
// 2.Убирает животное с номером i из зоопарка
//   (Использовать этот алгоритм https://gospodaretsva.com/urok-26-udalenie-elementa-iz-odnomernogo-massiva.html,
//    для удаления из массива, для удаления из стека и очереди вы алгоритмы знаете)
// 3.Посмотреть информацию о животном с номером i
// 4.Заставить животное с номером i издать звук
// 5.Напечатать информацию о животных, которые есть на данный момент в зоопарке
// 6.Заставить всех животных, которые на данный момент есть в зоопарке, издать звук

package Animals;

import java.util.ArrayList;

public class Zoo {

    private ArrayList <Animal> zooList;
    
    public Zoo () {
        zooList = new ArrayList<Animal>();
    }

    public void addAnimal(Animal animal) {
        zooList.add(animal);
    }

    public String getInfoAnimal(int index){
        return zooList.get(index-1).printInfo();
    }

    public void removeAnimal(int index) {
        zooList.remove(index-1);
    }

    public void makeSound (int index){
        zooList.get(index-1).makeSound();
    }

    public void printZooList (){
        System.out.println("Список зоопарка:");
        for(int i = 0; i< zooList.size(); i++) {
            System.out.println(String.format("%d. %s", i+1, zooList.get(i).printInfo()));
        }
        System.out.println("-------------------------------");
    }

    public void zooSound(){
        for (Animal animal : zooList){
            animal.makeSound();
        }
    }
}

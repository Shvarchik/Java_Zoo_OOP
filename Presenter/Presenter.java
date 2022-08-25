package Presenter;

import Exceptions.UncorrectValueExceptions;
import Model.*;
import View.ConsoleViewAnimal;

public class Presenter {

    Zoo zoo;
    ConsoleViewAnimal view;

    public Presenter(Zoo zoo) {
        this.zoo = zoo;
        view = new ConsoleViewAnimal();
    }
    public void createAnimal() throws UncorrectValueExceptions {
        StringBuilder sb = new StringBuilder();
        sb.append("\n ======= Coose Animal ==== \n");
        sb.append("1 - Dog\n");
        sb.append("2 - Cat\n");
        sb.append("3 - Tiger\n");
        sb.append("4 - Wolf\n");
        sb.append("5 - Chicken\n");
        sb.append("6 - Stork\n");
        sb.append("0 - exit\n");
        view.set(sb.toString());
        String response = view.get();
        Animal animal;
        switch (response){
            case "1":
                animal = new Dog(view.getName(), view.getBreed(), view.getColor(), view.getHeight(), 
                    view.getWeight(), view.getEyeColor(), view.getVaccinated(), view.getDateOfBirth(), view.getTrained());
                    zoo.addAnimal(animal);
                    break;
            case "2":
                animal = new CreateCat().create();
                    zoo.addAnimal(animal);
                break;
            case "3":
                animal = new Tiger(view.getHeight(), view.getWeight(), view.getEyeColor(),view.getColor(),
                    view.getLifeArea(), view.getDateOfFound());
                    zoo.addAnimal(animal);
                break;
            case "4":
                animal = new Wolf(view.getHeight(), view.getWeight(), view.getEyeColor(),view.getColor(),
                    view.getLifeArea(), view.getDateOfFound(), view.getPackLeader());
                zoo.addAnimal(animal);
                break;
            case "5":
                animal = new Chicken(view.getHeight(), view.getWeight(), view.getEyeColor(),view.getColor(), view.getHeightOfFlight());
                zoo.addAnimal(animal);
                break;
            case "6":
                animal = new Stork(view.getHeight(), view.getWeight(), view.getEyeColor(),view.getColor(), view.getHeightOfFlight());
                zoo.addAnimal(animal);
                break;
            case "0": 
                return;
            default:
                System.out.println("нет такого варианта");
            break;
        }
        
        view.set("ok");
    }
    public void remove(){
        view.set("Введите номер удаляемого животного:");
        int index = Integer.parseInt(view.get());
        zoo.removeAnimal(index);
    }
    public void print(){
        view.set("Введите номер животного:");
        int index = Integer.parseInt(view.get());
        view.set(zoo.getInfoAnimal(index));
    }
    public void listZoo(){
        zoo.printZooList();
    }

    public void sound (){
        view.set("Введите номер животного, которого хотите услышать:");
        int index = Integer.parseInt(view.get());
        zoo.makeSound(index);
    }
    public void zooSound(){
        zoo.soundAll();
    }
}


// добавлять новых животных в зоопарк, 
// убирать животных из зоопарка,
// печатать информацию о конкретном животном(вводя его номер),
// печатать информацию о всех животных в зоопарке на данный момент, 
// заставлять животное издавать звук(введя номер животное),
// заставлять издавать звук всех животных, которые на данный момент есть в зоопарке)

package View;

import Model.*;
import Presenter.Presenter;

public class MenuEntrance {

    Presenter p;
    View view;
    
    public MenuEntrance(Zoo zoo) {
        
        view = new ConsoleViewAnimal ();
        p = new Presenter(zoo);
    }

    public void start() throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append("\n ==== \n");
        sb.append("1 - add new animal\n");
        sb.append("2 - remove animal\n");
        sb.append("3 - show animal\n");
        sb.append("4 - show list of Zoo\n");
        sb.append("5 - sound of Animal\n");
        sb.append("6 - sound of Zoo\n");
        sb.append("0 - exit\n");
        while (true) {
            view.set(sb.toString());
            switch (view.get()) {
                case "1":
                    p.createAnimal();
                    break;
                case "2":
                    p.remove();
                    break;
                case "3":
                    p.print();
                    break;
                case "4":
                    p.listZoo();
                    break;
                case "5":
                    p.sound();
                    break;
                case "6":
                    p.zooSound();
                    break;
                case "0":
                    return;
                default:
                    System.out.println ("нет такого варианта");
            }
        }
    }
}


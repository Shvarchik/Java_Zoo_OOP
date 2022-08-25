package Presenter;

import Model.Animal;
import Model.Cat;
import View.ConsoleViewAnimal;

public class CreateCat implements Creatable{

    ConsoleViewAnimal view;
 
    public CreateCat() {
        view = new ConsoleViewAnimal();
    }

    @Override
    public Animal create() {
        
        Cat cat = new Cat(view.getName(), view.getBreed(), view.getColor(), view.getHeight(), 
                view.getWeight(), view.getEyeColor(), view.getVaccinated(), view.getDateOfBirth(), view.getPresenceOfWool());
        return cat;
    }
}

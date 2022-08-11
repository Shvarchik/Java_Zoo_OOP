﻿package Animals;

public abstract class WildAnimal {

    protected String lifeArea;
    private String dateOfFound;


public WildAnimal (int height, int weight, String eyeColor, String color, String lifeArea, String dateOfFound) {
    super(height, weight, eyeColor, color);
    this.lifeArea = lifeArea;
    this.dateOfFound = dateOfFound;
}

@Override
public abstract void makeSound();

@Override
public String printInfo (){
    return String.format ("%s, %s, %s", super.PrintInfo, this.lifeArea, this.dateOfFound);

}
}
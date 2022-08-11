﻿package Animals;
public class Chicken extends Bird{
    
    private int heightOfFly;
    
    public Chicken (int height, int weight,  String eyeColor, String color, int heightOfFly) {
        
        super (height, weight, eyeColor, color, heightOfFly);
    }
    
    @Override
    public void makeSound() {
        System.out.println("кудах-тах-тах");
    }

    @override
    public void Fly() {
        System.out.println(String.format("%s %d", "лечу на бреющем полете, высота ",this.heightOfFly));
    }
}

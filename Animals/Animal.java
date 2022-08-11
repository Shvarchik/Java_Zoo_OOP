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


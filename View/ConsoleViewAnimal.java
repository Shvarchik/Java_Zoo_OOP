package View;

import java.util.Scanner;

public class ConsoleViewAnimal implements View {
    Scanner in;

    public ConsoleViewAnimal() {
        in = new Scanner(System.in);
    }
    public String getName() {
        System.out.printf("Name: ");
        return in.nextLine();
    }
    public String getBreed() {
        System.out.printf("Breed: ");
        return in.nextLine();
    }
    public String getDateOfFound() {
        System.out.printf("dateOfFound: ");
        return in.nextLine();
    }
    public String getDateOfBirth() {
        System.out.printf("dateOfFound: ");
        return in.nextLine();
    }
    public String getLifeArea() {
        System.out.printf("lifeArea: ");
        return in.nextLine();
    }
    public String getPackLeader() {
        System.out.printf("PackLeader: ");
        return in.nextLine();
    }
    public Boolean getVaccinated() {
        System.out.printf("vaccinated: ");
        return in.nextBoolean();
    }
    public Boolean getTrained() {
        System.out.printf("trained: ");
        return in.nextBoolean();
    }
    public Boolean getPresenceOfWool() {
        System.out.printf("presenceOfWool: ");
        return in.nextBoolean();
    }
    public Double getHeightOfFlight() {
        System.out.printf("heightOfFlight: ");
        return in.nextDouble();
    }

    @Override
    public Integer getHeight() {
        System.out.printf("Height: ");
        return in.nextInt();
    }
    @Override
    public Integer getWeight() {
        System.out.printf("Weight: ");
        return in.nextInt();
    }    
    @Override
    public String getEyeColor() {
        System.out.printf("eyeClolr: ");
        return in.nextLine();
    }
    @Override
    public String getColor() {
        System.out.printf("Color: ");
        return in.nextLine();
    }
    @Override
    public void set(String value) {
        System.out.printf("%s\n", value);  
    }
    @Override
    public String get() {
        return in.next();
    }
    
}

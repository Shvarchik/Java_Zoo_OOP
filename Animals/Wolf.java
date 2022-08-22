package Animals;

public class Wolf extends WildAnimal {

    private String pack_leader;

    public Wolf (int height,  int weight, String eyeColor, String color, String lifeArea, String dateOfFound, String pack_leader) {
        
        super(height, weight, eyeColor, color, lifeArea, dateOfFound);
        this.pack_leader = pack_leader;
    }

    @Override
    public void makeSound() {
        System.out.println("OUUU!!!");
    }

    @Override
    public String printInfo(){
        return String.format("Волк %s, %s", super.printInfo(), this.pack_leader);
    }
    public String getPackLeader (){
        return pack_leader;
    }

}
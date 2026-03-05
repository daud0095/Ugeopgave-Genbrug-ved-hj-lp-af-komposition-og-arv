package Del2;

public class Animal {
    private String name;
    private int energy;

    public Animal(String name, int energy){
        this.name = name;
        this.energy = energy;
    }
    public String getName() {
        return name;
    }
    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy){
        this.energy = Math.max(0, energy);
    }

    public boolean isActive(){
        return energy > 0;
    }

    public int attack() {
        return 0;
    }

    @Override
    public String toString() {
        return name + " (energi: " + energy + ")";
    }
}

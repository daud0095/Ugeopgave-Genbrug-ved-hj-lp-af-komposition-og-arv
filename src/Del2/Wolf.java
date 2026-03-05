package Del2;

import java.util.Random;

public class Wolf extends Animal {
    private static final Random RAND = new Random();

    public Wolf(String name, int energy){
        super(name, energy);
    }

    @Override
    public int attack(){
        return 5 + RAND.nextInt(8);
    }
}

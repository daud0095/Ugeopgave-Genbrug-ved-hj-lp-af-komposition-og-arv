package Del2;

import java.util.Random;

public class Rabbit extends Animal{
    public Rabbit(String name, int energy){
        super(name, 65);
    }

    @Override
    public int attack(){
        return 4;
    }
}

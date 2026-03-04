package Del1;

import java.util.ArrayList;

public class Room {
    private String name;
    private ArrayList<Lamp> lamps;
    private ArrayList<Window> windows;

    public Room(String name){
        this.name = name;
        lamps = new ArrayList<>();
        windows = new ArrayList<>();

    }

    public void addLamp(Lamp lamp){
        lamps.add(lamp);
    }
    public void addWindow(Window window){
        windows.add(window);
    }

    public int getLampCount(){
        return lamps.size();
    }

    public int getTotalWatt(){
        int total = 0;

        for(Lamp lamp : lamps){
            total += lamp.getWatt();
        }
        return total;
    }

    public int getTotalWindowArea(){
        int total = 0;

        for(Window window : windows){
            total += window.getAreaCm2();
        }
        return total;
    }

    public void printRoom(){
        System.out.println("Room name: " + name);
        System.out.println("Number of lamps: " + getLampCount());
        System.out.println("Total watt: " + getTotalWatt());
        System.out.println("Total window area: " + getTotalWindowArea());
    }

}

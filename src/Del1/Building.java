package Del1;

import java.util.ArrayList;

public class Building {
    private String name;
    private ArrayList<Room> rooms;

    public Building(String name){
        this.name = name;
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room){
        rooms.add(room);
    }

    public int getTotalLampCount(){
        int total = 0;

        for(Room room : rooms){
            total += room.getLampCount();
        }
        return total;
    }

    public void printBuilding(){
        System.out.println("Building: " + name);
        System.out.println("Number of rooms; " + rooms.size());
        System.out.println("Total lamps: " + getTotalLampCount());
    }
}

package Del1;

public class Main {
    public static void main(String[] args){

        Building building1 = new Building("Kontorbygningen");
        Room meetingRoom = new Room("Mødelokale");

        meetingRoom.addLamp(new Lamp(60));
        meetingRoom.addLamp(new Lamp(60));
        meetingRoom.addLamp(new Lamp(100));
        meetingRoom.getTotalWatt();

        meetingRoom.addWindow(new Window(120, 90));
        meetingRoom.addWindow(new Window(120, 90));


        Room kitchenRoom = new Room("Køkken");
        kitchenRoom.addLamp(new Lamp(40));
        kitchenRoom.addLamp(new Lamp(40));
        kitchenRoom.getTotalWatt();

        kitchenRoom.addWindow(new Window(60, 60));

        meetingRoom.getLampCount();
        meetingRoom.getTotalWatt();

        meetingRoom.printRoom();
        kitchenRoom.printRoom();

        /*
        Room livingRoom = new Room("Living Room");

        livingRoom.addLamp(new Lamp(50));
        livingRoom.addLamp(new Lamp(65));

        livingRoom.addWindow(new Window(85, 135));
        livingRoom.addWindow(new Window(80, 140));

        livingRoom.printRoom();
         */

    }
}

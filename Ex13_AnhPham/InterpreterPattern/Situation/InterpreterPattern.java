package InterpreterPattern.Situation;

import java.util.ArrayList;
import java.util.List;

public class InterpreterPattern {

    public static void main(String[] args) {
        List<String> bedRoomItems = new ArrayList<>();
        bedRoomItems.add("Bed");
        bedRoomItems.add("Wardrobe");
        Room bedRoom = new BedRoom(bedRoomItems);

        List<String> bathRoomItems = new ArrayList<>();
        bathRoomItems.add("Mirror");
        bathRoomItems.add("Faucet");
        Room bathRoom = new BathRoom(bathRoomItems);

        System.out.println("Bed is in Bedroom? " + bedRoom.include("Bed"));
        System.out.println("Faucet is in Bathroom? " + bathRoom.include("Faucet"));
        System.out.println("Wardrobe is in Bathroom? " + bathRoom.include("Wardrobe"));
    }
}
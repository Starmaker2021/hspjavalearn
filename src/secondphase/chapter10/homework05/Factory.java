package secondphase.chapter10.homework05;

public class Factory {
    public static Boat getBoat() {
        Boat boat = new Boat();
        return boat;
    }
    public static Horse getHorse(){
        Horse horse = new Horse();
        return horse;
    }
}

public class MeetingRoom {
    public String id;
    public int capacity;
    public int floor;

    public MeetingRoom(String id, int capacity, int floor) {
        this.id = id;  //refers to the current object in a method or constructor.
        this.capacity = capacity;
        this.floor = floor;
    }
    public String getId() {
        return id;
    }
    public int getCapacity() {
        return capacity;
    }
    public int getFloor() {
        return floor;
    }
}

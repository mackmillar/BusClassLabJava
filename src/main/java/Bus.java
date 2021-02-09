import java.util.ArrayList;

public class Bus {
    private String destination;
    private ArrayList<Person> capacity;

    public Bus(String destination) {
        this.destination = destination;
        this.capacity = new ArrayList<Person>();
    }
        public String getDestination(){
            return this.destination;

    }

    public int passengerCount() {
        return this.capacity.size();
    }
}

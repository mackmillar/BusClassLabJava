import java.util.ArrayList;

public class Bus {
    private String destination;
    private ArrayList<Person> capacity;
    private Boolean capacityReached;

    public Bus(String destination) {
        this.destination = destination;
        this.capacity = new ArrayList<Person>();
        this.capacityReached = false;
    }
        public String getDestination(){
            return this.destination;

    }

    public int passengerCount() {
        return this.capacity.size();
    }

    public void addPerson(Person person) {
        //        will not add person if count = capacity
        this.capacity.add(person);
    }
}

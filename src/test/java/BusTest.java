import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void before(){
    bus = new Bus("Edinburgh");
//    Why cant this be Person passenger???
    person = new Person("Iggy");
    }

    @Test
    public void hasDestination(){
        assertEquals("Edinburgh", bus.getDestination());
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPerson(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void wontBreachCapacity(){
//        will not add person if count = capacity
        bus.addPerson(person);
        assertEquals(false, bus.addPerson(person));
    }

}

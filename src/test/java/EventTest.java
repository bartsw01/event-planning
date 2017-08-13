import models.Event;
import org.junit.Test;

import static org.junit.Assert.*;

public class EventTest {

    @Test
    public void calculateEventCost_returnsCostForWedding_17000() throws Exception {
        Event testEvent = new Event("wedding", 100, "steak dinner", "full bar", "live band");
        Integer expected = 17000;
        assertEquals(expected, testEvent.getEventCost());
    }

    @Test
    public void calculateEventCost_returnsCostForWedding_5000() throws Exception {
        Event testEvent = new Event("wedding", 25, "sandwiches", "full bar", "no bar");
        Integer expected = 5000;
        assertEquals(expected, testEvent.getEventCost());
    }


}


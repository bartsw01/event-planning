import models.Event;
import org.junit.Test;

import static org.junit.Assert.*;

public class EventTest {

    @Test
    public void calculateEventCost_returnsCostForWedding_17000() throws Exception {
        Event testEvent = new Event("wedding", 100, "steak dinner", "full bar", "live band");
        Integer expected = 15000;
        assertEquals(expected, testEvent.getEventCost());
    }
}


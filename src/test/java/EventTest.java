import org.junit.Test;

import static org.junit.Assert.*;

public class EventTest {

    @Test
    public void calculateEventCost_returnsCostForWedding_16000() throws Exception {
        Event testEvent = new Event("wedding", 100, "steak dinner", "full bar", "live band");
        Integer expected = 16000;
        assertEquals(expected, testEvent.calculateEventCost());
    }
}


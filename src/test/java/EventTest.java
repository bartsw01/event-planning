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
    public void calculateEventCost_returnsCostForWedding_3850() throws Exception {
        Event testEvent = new Event("wedding", 25, "sandwiches", "full bar", "background music");
        Integer expected = 3850;
        assertEquals(expected, testEvent.getEventCost());
    }

    @Test
    public void calculateEventCost_returnsCostForCorporate_34750() throws Exception {
        Event testEvent = new Event("corporate", 300, "sandwiches", "full bar", "live band");
        Integer expected = 34750;
        assertEquals(expected, testEvent.getEventCost());
    }

    @Test
    public void calculateEventCost_returnsCostForCorporate_1225() throws Exception {
        Event testEvent = new Event("corporate", 25, "sandwiches", "no bar", "background music");
        Integer expected = 1225;
        assertEquals(expected, testEvent.getEventCost());
    }

    @Test
    public void calculateEventCost_returnsCostForBirthday_16500() throws Exception {
        Event testEvent = new Event("birthday", 100, "steak dinner", "full bar", "live band");
        Integer expected = 16500;
        assertEquals(expected, testEvent.getEventCost());
    }

    @Test
    public void calculateEventCost_returnsCostForReunion_23400() throws Exception {
        Event testEvent = new Event("reunion", 500, "chicken dinner", "cash bar", "dj");
        Integer expected = 23400;
        assertEquals(expected, testEvent.getEventCost());
    }

    @Test
    public void calculateDiscountedEventCost_returnsDiscountedCostFor_23400() throws Exception {
        Event testEvent = new Event("reunion", 500, "chicken dinner", "cash bar", "dj");
        Integer expected = 23400;
        assertEquals(expected, testEvent.getEventCost());
    }




}


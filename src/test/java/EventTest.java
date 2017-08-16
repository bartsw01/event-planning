import models.Event;
import org.junit.Test;

import static org.junit.Assert.*;

public class EventTest {

    @Test
    public void calculateEventCost_returnsCostForWedding_21000() throws Exception {
        Event testEvent = new Event("wedding", 100, "steak dinner", "full bar", "live band");
        Integer expected = 21000;
        assertEquals(expected, testEvent.getEventCost());
    }

    @Test
    public void calculateEventCost_returnsCostForWedding_4000() throws Exception {
        Event testEvent = new Event("wedding", 25, "sandwiches", "full bar", "background music");
        Integer expected = 4000;
        assertEquals(expected, testEvent.getEventCost());
    }

    @Test
    public void calculateEventCost_returnsCostForCorporate_38750() throws Exception {
        Event testEvent = new Event("corporate", 300, "sandwiches", "full bar", "live band");
        Integer expected = 38750;
        assertEquals(expected, testEvent.getEventCost());
    }

    @Test
    public void calculateEventCost_returnsCostForCorporate_1375() throws Exception {
        Event testEvent = new Event("corporate", 25, "sandwiches", "no bar", "background music");
        Integer expected = 1375;
        assertEquals(expected, testEvent.getEventCost());
    }

    @Test
    public void calculateEventCost_returnsCostForBirthday_16500() throws Exception {
        Event testEvent = new Event("birthday", 100, "steak dinner", "full bar", "live band");
        Integer expected = 20500;
        assertEquals(expected, testEvent.getEventCost());
    }

    @Test
    public void calculateEventCost_returnsCostForReunion_23400() throws Exception {
        Event testEvent = new Event("reunion", 500, "chicken dinner", "cash bar", "dj");
        Integer expected = 23900;
        assertEquals(expected, testEvent.getEventCost());
    }

    @Test
    public void calculateDiscountedEventCost_returnsFreeDJForReunion_250guests() throws Exception {
        Event testEvent = new Event("reunion", 250, "chicken dinner", "cash bar", "dj");
        Integer expected = 9650;
        assertEquals(expected, testEvent.getDiscountedEventCost("guest250"));
    }

    @Test
    public void calculateEventCost_returnsFreeLiveBandForReunion_500guest() throws Exception {
        Event testEvent = new Event("reunion", 500, "chicken dinner", "cash bar", "dj");
        Integer expected = 18400;
        assertEquals(expected, testEvent.getDiscountedEventCost("guest500"));
    }

    @Test
    public void calculateEventCost_returnsFreeChickenDinnerForWedding_1000guest() throws Exception {
        Event testEvent = new Event("wedding", 1000, "steak dinner", "full bar", "live band");
        Integer expected = 144500;
        assertEquals(expected, testEvent.getDiscountedEventCost("guest1000"));
    }








}


import org.junit.Test;

import static org.junit.Assert.*;

public class EventTest {

    @Test
    public void eventOptions_shouldBeASting_true() throws Exception {
        Event testOption = new Event();
        String userOption = "wedding";
        assertEquals(userOption, testOption.runOption("wedding"));
    }
}
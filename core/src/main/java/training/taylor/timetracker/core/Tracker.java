package training.taylor.timetracker.core;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import training.taylor.timetracker.core.dao.TimeEntry;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = TrackerCoreConfig.class) // Load the configuration explicitly
public class TrackerTest {

    @Autowired
    private Tracker tracker;

    @Test
    void testAdd() {
        TimeEntry entry = new TimeEntry();
        tracker.add(entry);
        assertEquals(1, tracker.size());
    }

    @Test
    void testRemove() {
        TimeEntry entry = new TimeEntry();
        tracker.add(entry);
        tracker.remove(entry);
        assertEquals(0, tracker.size());
    }
}

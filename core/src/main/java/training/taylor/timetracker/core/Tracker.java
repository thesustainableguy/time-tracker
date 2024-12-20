package training.taylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.ArrayList;
import java.util.List;

@Component
public class Tracker {
    @Autowired
    private List<TimeEntry> entries = new ArrayList<>();

    public void add(TimeEntry entry) {
        entries.add(entry);
    }

    public void remove(TimeEntry entry) {
        entries.remove(entry);
    }

    public int size() {
        return entries.size();
    }

    public TimeEntry get(int index) {
        try {
            return entries.get(index);
        } catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Index out of bounds: " + index, e);
        }
    }
}

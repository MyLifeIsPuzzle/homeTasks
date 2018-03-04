package homeTaskThirteen;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Day {

    @Getter
    private String date;
    @Getter
    private List<Activity> activities = new ArrayList<>();

    public Day(String date) {
        this.date = date;
    }
}

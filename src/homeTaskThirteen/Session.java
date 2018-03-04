package homeTaskThirteen;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Session {

    @Getter
    private String name;
    @Getter
    private List<Day> listOfDays = new ArrayList<>();

    public Session(String name) {
        this.name = name;
    }
}

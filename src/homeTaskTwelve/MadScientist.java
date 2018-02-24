package homeTaskTwelve;

import java.util.Map;

public class MadScientist {

    private String name;
    private int amountOfRobots;
    private Map<String, Integer> details;

    public MadScientist(String name) {
        this.details = DetailsUtil.createEmptyMapOfDetails();
        this.name = name;
    }

    public void buildRobots() {
        amountOfRobots = details.values().stream().min(Integer::compareTo).get();

        details.keySet().forEach(key -> details.merge(key, amountOfRobots, (v1, v2) -> v1 - v2));
    }

    public Map<String, Integer> getDetails() {
        return details;
    }

    public void setDetails(Map<String, Integer> details) {
        this.details = details;
    }

    public int getAmountOfRobots() {
        return amountOfRobots;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MadScientist{" +
                "name='" + name + '\'' +
                ", amountOfRobots=" + amountOfRobots +
                ", details=" + details +
                '}';
    }
}

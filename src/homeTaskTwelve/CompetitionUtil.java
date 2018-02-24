package homeTaskTwelve;

import java.util.List;
import java.util.stream.Collectors;

public final class CompetitionUtil {

    public CompetitionUtil() {
    }

    public static List<Servant> createServantsForMadScientists(Dump dump, List<MadScientist> madScientists) {
        return madScientists.stream()
                .map(madScientist -> new Servant(dump, madScientist))
                .collect(Collectors.toList());
    }

    public static void buildRobots(List<MadScientist> madScientists) {
        madScientists.forEach(MadScientist::buildRobots);
    }

    public static List<MadScientist> findTheWinner(List<MadScientist> madScientists) {
        int maxAmountOfBuiltRobots = madScientists.stream()
                .map(MadScientist::getAmountOfRobots)
                .max((Integer::compare))
                .get();

        return madScientists.stream()
                .filter(madScientist -> madScientist.getAmountOfRobots() == maxAmountOfBuiltRobots)
                .collect(Collectors.toList());
    }
}

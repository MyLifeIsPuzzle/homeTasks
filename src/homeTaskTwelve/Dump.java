package homeTaskTwelve;

import java.util.Map;
import java.util.stream.Stream;

public class Dump {

    private static final int INITIAL_AMOUNT_OF_DETAILS_AT_DUMP = 20;
    private final Map<String, Integer> details;

    public Dump() {
        this.details = DetailsUtil.createEmptyMapOfDetails();
    }

    public void generateInitialDetailsForDump() {
        Stream.generate(() -> Details.values()[Constants.RANDOM.nextInt(Details.values().length)].getName())
                .limit(INITIAL_AMOUNT_OF_DETAILS_AT_DUMP)
                .forEach(detailName -> details.merge(detailName, Constants.AMOUNT_OF_DETAILS_TO_ADD, Integer::sum));
    }

    public Map<String, Integer> getDetails() {
        return details;
    }
}

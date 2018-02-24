package homeTaskTwelve;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Servant extends Thread {

    private final MadScientist madScientist;
    private final Dump dump;

    public Servant(Dump dump, MadScientist madScientist) {
        this.dump = dump;
        this.madScientist = madScientist;
    }

    @Override
    public void run() {
        for (int i = 0; i < Constants.AMOUNT_OF_DAYS; i++) {
            synchronized (dump) {
                gatherDetails();
                try {
                    dump.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void gatherDetails() {
        if (!new ArrayList<>(dump.getDetails().values()).isEmpty()){
            for (int j = 0; j < Constants.RANDOM.nextInt(Constants.MAX_AMOUNT_OF_DETAILS_TO_TAKE_PER_DAY) + 1; j++) {
                List<String> availableDetails = dump.getDetails().entrySet().stream()
                        .filter(v -> v.getValue() > 0)
                        .map(Map.Entry::getKey)
                        .collect(Collectors.toList());

                if (!availableDetails.isEmpty()) {
                    String currentDetail = availableDetails.get(Constants.RANDOM.nextInt(availableDetails.size()));

                    dump.getDetails().merge(currentDetail, Constants.AMOUNT_OF_DETAILS_TO_REMOVE, (x, y) -> x - y);

                    madScientist.getDetails().merge(currentDetail, Constants.AMOUNT_OF_DETAILS_TO_ADD, Integer::sum);
                }
            }

        }
    }
}



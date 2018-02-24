package homeTaskTwelve;

import java.util.Arrays;
import java.util.List;

public class CompetitionBetweenScientists {

    public static void main(String[] args) {
        Dump dump = new Dump();
        Thread factory = new Factory(dump);
        List<MadScientist> madScientists = Arrays.asList(new MadScientist("Chaos"), new MadScientist("Zlobnikus"));
        List<Servant> servants = CompetitionUtil.createServantsForMadScientists(dump, madScientists);
        Thread harvest = new Harvest(dump, factory, servants);

        dump.generateInitialDetailsForDump();

        harvest.start();
        try {
            harvest.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        CompetitionUtil.buildRobots(madScientists);

        List<MadScientist> winnerScientist = CompetitionUtil.findTheWinner(madScientists);

        InfoPrintUtil.showBuiltRobots(madScientists);
        InfoPrintUtil.showRemainingDetails(madScientists);
        InfoPrintUtil.showRatingOfScientists(madScientists);
        InfoPrintUtil.showTheWinner(madScientists);
    }
}

package homeTaskTwelve;

import java.util.List;

public final class InfoPrintUtil {

    private InfoPrintUtil() {
    }

    public static void showRemainingDetails(List<MadScientist> madScientists) {
        System.out.println("Remaining details of all scientists:");
        madScientists.forEach(madScientist -> System.out.println(madScientist.getName() + " " + madScientist.getDetails()));
        System.out.println();
    }

    public static void showRemainingDetails(MadScientist madScientist) {
        System.out.println(madScientist.getName() + "'s remaining details:");
        System.out.println(madScientist.getDetails());
        System.out.println();
    }

    public static void showBuiltRobots(List<MadScientist> madScientists) {
        System.out.println("Amount of robots that were built by every scientist:");
        madScientists.forEach(madScientist -> System.out.println(madScientist.getName() + " " + madScientist.getAmountOfRobots()));
        System.out.println();
    }

    public static void showBuiltRobots(MadScientist madScientist) {
        System.out.println(madScientist.getName() + " built robots:");
        System.out.println(madScientist.getName() + " " + madScientist.getAmountOfRobots());
        System.out.println();
    }

    public static void showRatingOfScientists(List<MadScientist> madScientists) {
        System.out.println("Scientists rating:");
        madScientists.sort(((o1, o2) -> Integer.compare(o2.getAmountOfRobots(), o1.getAmountOfRobots())));
        madScientists.forEach(System.out::println);
        System.out.println();
    }

    public static void showTheWinner(List<MadScientist> madScientists) {
        System.out.println("The winner is:");
        CompetitionUtil.findTheWinner(madScientists).forEach(System.out::println);
    }
}

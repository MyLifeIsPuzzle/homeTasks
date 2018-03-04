package homeTaskThirteen;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public final class LogUtil {

    private static final String BLANK_LINE = "";

    public static void createTimeIntervalLog(Session session) throws IOException {
        List<String> timeIntervalLog = new ArrayList<>();

        session.getListOfDays().forEach(day ->
        {
            timeIntervalLog.add(day.getDate());
            day.getActivities().stream()
                    .map(s -> (String.format(("%s-%s %s"), s.getBeginningTime(), s.getEndingTime(), s.getName())))
                    .forEach(timeIntervalLog::add);
            timeIntervalLog.add(BLANK_LINE);
        });
        Files.write(Paths.get("src", "homeTaskThirteen", "durationLog.txt"), timeIntervalLog);
    }

    public static void createDetailedLog(Session session) throws IOException {
        List<String> detailedLog = new ArrayList<>();

        createLectureLog(session, detailedLog);
        detailedLog.add(BLANK_LINE);
        createPercentOfActivityLog(session, detailedLog);
        Files.write(Paths.get("src", "homeTaskThirteen", "detailedLog.txt"), detailedLog);
    }

    private static void createLectureLog(Session session, List<String> detailedLog) {
        int totalLengthOfLectures = countTotalDurationOfAllLectures(session);

        detailedLog.add("Lectures " + totalLengthOfLectures + " minutes:");
        session.getListOfDays().forEach(day -> day.getActivities().stream()
                .filter(v -> v.getTypeOfActivity() == TypeOfActivity.LECTURE)
                .forEach(v -> detailedLog.add(String.format("%s: %d minutes %d%%",
                        v.getName(),
                        DurationUtil.countDuration(v),
                        (Math.round((double) DurationUtil.countDuration(v) / totalLengthOfLectures * 100))))));
    }

    private static int countTotalDurationOfAllLectures(Session session) {
        return session.getListOfDays().stream()
                .map(Day::getActivities)
                .map(activities -> activities.stream()
                        .filter(activity -> activity.getTypeOfActivity() == TypeOfActivity.LECTURE)
                        .mapToInt(DurationUtil::countDuration))
                .mapToInt(IntStream::sum)
                .sum();
    }

    private static void createPercentOfActivityLog(Session session, List<String> detailedLog) {
        detailedLog.add("Activities:");
        session.getListOfDays().forEach(day ->
        {
            int totalTimeForDay = day.getActivities().stream().mapToInt(DurationUtil::countDuration).sum();
            detailedLog.add(String.format("%s %d minutes:", day.getDate(), totalTimeForDay));
            Arrays.stream(TypeOfActivity.values()).forEach(type ->
            {
                int totalTimeForActivity = day.getActivities().stream()
                        .filter(activity -> activity.getTypeOfActivity() == type)
                        .mapToInt(DurationUtil::countDuration)
                        .sum();
                detailedLog.add(String.format("%s: %d minutes %d%%",
                        type.name,
                        totalTimeForActivity,
                        (Math.round((double) totalTimeForActivity / totalTimeForDay * 100))));
            });
            detailedLog.add(BLANK_LINE);
        });
    }
}



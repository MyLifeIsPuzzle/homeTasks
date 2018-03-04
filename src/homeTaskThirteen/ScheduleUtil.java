package homeTaskThirteen;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ScheduleUtil {

    private static final String ACTIVITY_REGEX = "^(?<time>([0-9]|0[0-9]|1[0-9]|2[0-3]):[0-5][0-9])\\s(?<name>.+)$";
    private static final String DATE_REGEX = "^(0?[1-9]|[12][0-9]|3[01]).(0?[1-9]|1[012]).(\\d{4})$";
    private static final Activity EMPTY_ACTIVITY = new Activity("00:00", "00:00", "Empty", TypeOfActivity.LECTURE);
    private static final Day EMPTY_DAY = new Day("Empty Day");

    private ScheduleUtil() {
    }

    public static void readSchedule(File schedule, Session session) throws FileNotFoundException {
        Pattern activityPattern = Pattern.compile(ACTIVITY_REGEX);
        Pattern datePattern = Pattern.compile(DATE_REGEX);
        Activity prevActivity = EMPTY_ACTIVITY;
        Day currentDay = EMPTY_DAY;

        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(schedule)))) {
            while (scanner.hasNextLine()) {
                String currentLine = scanner.nextLine();
                Matcher dateMatcher = datePattern.matcher(currentLine);
                Matcher activityMatcher = activityPattern.matcher(currentLine);

                if (activityMatcher.find()) {
                    prevActivity.setEndingTime(activityMatcher.group("time"));

                    Activity currentActivity = new Activity(
                            activityMatcher.group("time"),
                            "00:00",
                            activityMatcher.group("name"),
                            ActivityUtil.identifyTypeOfActivity(activityMatcher.group("name")));
                    currentDay.getActivities().add(currentActivity);

                    prevActivity = currentActivity;
                } else {
                    if (dateMatcher.find()) {
                        currentDay = new Day(dateMatcher.group());
                        session.getListOfDays().add(currentDay);
                    }
                }
            }
        }
        session.getListOfDays().forEach(day -> day.getActivities().remove(day.getActivities().size() - 1));
    }
}

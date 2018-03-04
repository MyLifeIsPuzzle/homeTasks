package homeTaskThirteen;

public final class DurationUtil {

    private static final int MINUTES_IN_OUR = 60;

    private DurationUtil() {
    }

    public static int countDuration(Activity activity) {
        return ((hours(activity.getEndingTime()) * MINUTES_IN_OUR + minutes(activity.getEndingTime())) -
                (hours(activity.getBeginningTime()) * MINUTES_IN_OUR + minutes(activity.getBeginningTime())));
    }

    private static int hours(String time) {
        return Integer.parseInt(time.substring(0, time.indexOf(":")));
    }

    private static int minutes(String time) {
        return Integer.parseInt(time.substring(time.indexOf(":") + 1, time.length()));
    }
}

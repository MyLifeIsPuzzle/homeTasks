package homeTaskThirteen;

import java.io.File;
import java.io.IOException;

import static java.lang.String.join;

public class SessionLogs {

    public static void main(String[] args) {
        File schedule = new File(join(File.separator, "src", "homeTaskThirteen", "schedule.txt"));
        Session itAcademySession = new Session("It Academy session");

        try {
            ScheduleUtil.readSchedule(schedule, itAcademySession);

            LogUtil.createTimeIntervalLog(itAcademySession);

            LogUtil.createDetailedLog(itAcademySession);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

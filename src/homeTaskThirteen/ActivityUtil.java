package homeTaskThirteen;

import java.util.Arrays;

public final class ActivityUtil {

    private ActivityUtil() {
    }

    public static TypeOfActivity identifyTypeOfActivity(String nameOfActivity) {
        if (Arrays.stream(TypeOfActivity.values()).anyMatch(v -> v.activitiesOfThisType.contains(nameOfActivity))) {
            return Arrays.stream(TypeOfActivity.values())
                    .filter(type -> type.activitiesOfThisType.contains(nameOfActivity))
                    .findFirst()
                    .get();
        }

        return TypeOfActivity.LECTURE;
    }
}

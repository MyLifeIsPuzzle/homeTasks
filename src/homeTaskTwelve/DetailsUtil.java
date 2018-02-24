package homeTaskTwelve;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public final class DetailsUtil {

    private DetailsUtil() {
    }

    public static String randomDetail() {
        return Details.values()[Constants.RANDOM.nextInt(Details.values().length)].getName();
    }

    public static Map<String, Integer> createEmptyMapOfDetails() {
        return Arrays.stream(Details.values())
                .map(Details::getName)
                .collect(Collectors.toMap(detailName -> detailName, amount -> 0));
    }
}

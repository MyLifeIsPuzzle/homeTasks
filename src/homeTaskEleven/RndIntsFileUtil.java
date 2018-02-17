package homeTaskEleven;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public final class RndIntsFileUtil {

    public static final int BOUND = 100;

    public RndIntsFileUtil() {
    }

    public static void generate(File file, int amountOfIntegersToGenerate) throws IOException {
        Random random = new Random();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < amountOfIntegersToGenerate; i++) {
                bufferedWriter.append(Integer.toString(random.nextInt(BOUND))).append(System.lineSeparator());
            }
        }
    }

    public static List<String> sortStringListByInts(List<String> list) {
        list.sort(Comparator.comparingInt(Integer::parseInt));
        return list;
    }
}

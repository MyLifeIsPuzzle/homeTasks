package homeTaskEleven;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class RndIntsFile {

    public static final int AMOUNT_OF_INTEGERS_TO_GENERATE = 15;
    public static final Path PATH_TO_THE_FILE_WITH_INTS = Paths.get("src", "homeTaskEleven", "rndInts.txt");

    public static void main(String[] args) throws IOException {
        File file = new File(PATH_TO_THE_FILE_WITH_INTS.toString());

        RndIntsFileUtil.generate(file, AMOUNT_OF_INTEGERS_TO_GENERATE);

        List<String> rndIntsInStrRepresent = Files.readAllLines(PATH_TO_THE_FILE_WITH_INTS);

        List<String> sortedListOfStringInts = RndIntsFileUtil.sortStringListByInts(rndIntsInStrRepresent);

        Files.write(PATH_TO_THE_FILE_WITH_INTS, sortedListOfStringInts);
    }
}

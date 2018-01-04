import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Random;

/**
 * @author rochapaulo
 */
public class TestDataSeed {

    private static final String OUTPUT_FILE = "src/test/resources/sort-testdata.dat";
    private static final int NUMBER_OF_ARRAYS = 200;
    private static final int ARRAY_MAX_LENGTH = 1000;
    private static final Random random = new Random(0x023F);

    public static void main(String[] args) throws Exception {

        final TestDataSeed seed = new TestDataSeed();
        int counter = 0;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE))) {
            while (counter < NUMBER_OF_ARRAYS) {
                int[] arr = seed.generate(random.nextInt(ARRAY_MAX_LENGTH));
                String out = seed.format2Print(arr);
                writer.write(out);
                counter++;
            }
        }
    }

    private int[] generate(int arraySize) {
        return random.ints(arraySize).toArray();
    }

    private String format2Print(int[] out) {
        String unsorted = Arrays.toString(out);
        Arrays.sort(out);
        String sorted = Arrays.toString(out);
        return unsorted + " ; " + sorted + "\n";
    }

}

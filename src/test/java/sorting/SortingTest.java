package sorting;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * @author rochapaulo
 * @param <T>
 */
@RunWith(Parameterized.class)
public class SortingTest<T extends Comparable<T>> {

    private static final String TEST_DATA_FILE = "src/test/resources/sort-testdata.dat";
    private static final Collection<Integer[][]> TESTING_DATA = loadTestingData();
    private static final SortAlgorithm[] ALGORITHMS = {
            new BubbleSort(),
            new InsertionSort()
    };

    private final T[] input;
    private final T[] expected;
    private final SortAlgorithm algorithm;

    public SortingTest(T[] input, T[] expected, SortAlgorithm algorithm) {
        this.input = input;
        this.expected = expected;
        this.algorithm = algorithm;
    }

    @Test
    public void run() {
        algorithm.sort(input);
        Assert.assertArrayEquals(expected, input);
    }


    @Parameterized.Parameters(name = "{index} - {2}")
    public static Collection<Object[]> data() {
        final Collection<Object[]> parameters = new ArrayList<>();
        for (SortAlgorithm algorithm : ALGORITHMS) {
            for (Integer[][] entry : TESTING_DATA) {
                parameters.add(new Object[] { entry[0], entry[1], algorithm });
            }
        }
        return parameters;
    }

    private static Collection<Integer[][]> loadTestingData() throws RuntimeException {
        try {

            return Files.readAllLines(Paths.get(TEST_DATA_FILE))
                    .stream()
                    .map(line -> line.replaceAll("[\\[\\]]", ""))
                    .map(line -> line.split(";"))
                    .map(pair -> {
                        Integer input[] = parseArrayOfInts(pair[0].split(","));
                        Integer expected[] = parseArrayOfInts(pair[1].split(","));
                        return new Integer[][] { input, expected };
                    }).collect(Collectors.toList());

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    private static Integer[] parseArrayOfInts(String[] arr) {
        final Integer[] out = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            out[i] = Integer.parseInt(arr[i].trim());
        }
        return out;
    }
}


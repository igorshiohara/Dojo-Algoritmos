package sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class InsertionSortTest {

    @Test
    public void arrayVazio(){

        SortAlgorithm sort =  new InsertionSort();

        Integer[] array = new Integer[]{};

        sort.sort(array);

        Assert.assertArrayEquals(new Integer[]{}, array);
    }

    @Test
    public void array3Elementos(){

        SortAlgorithm sort =  new InsertionSort();

        Integer[] array = new Integer[]{5, 2, 4};

        sort.sort(array);

        Assert.assertArrayEquals(new Integer[]{2, 4, 5}, array);
    }

    @Test
    public void array5Elementos(){

        InsertionSort sort =  new InsertionSort();

        Integer[] array = new Integer[]{5, 2, 4, 0};

        sort.sort(array);

        Assert.assertArrayEquals(new Integer[]{0, 2, 4, 5}, array);
    }

    @Test
    public void arrayNElementos() throws Exception {

        SortAlgorithm sort =  new InsertionSort();

        Integer[] array = new Integer[]{ 5, 2, 4, 0, 4, 4, 5, 7, 34, 6, 563, 47, 74 };

        Integer[] expected = Arrays.copyOf(array, array.length);
        Arrays.sort(expected);

        sort.sort(array);

        Assert.assertArrayEquals(expected, array);

    }

}

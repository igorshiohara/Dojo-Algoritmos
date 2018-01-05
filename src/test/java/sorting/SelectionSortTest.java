package sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

public class SelectionSortTest {


    @Test
    public void arrayVazio() {

        SortAlgorithm selectionSort= new SelectionSort();

        Integer[] input = new Integer[]{};

        selectionSort.sort(input);
        Assert.assertArrayEquals(new Integer[]{}, input);
    }

    @Test
    public void arrayComUmElemento() {

        SortAlgorithm selectionSort= new SelectionSort();

        Integer[] input = new Integer[]{1};

        selectionSort.sort(input);
        Assert.assertArrayEquals(new Integer[]{1}, input);
    }

    @Test
    public void arrayComDoisElementos() {

        SortAlgorithm selectionSort= new SelectionSort();

        Integer[] input = new Integer[]{2,1};

        selectionSort.sort(input);
        Assert.assertArrayEquals(new Integer[]{1,2}, input);
    }

    @Test
    public void arrayComCincoElementos() {

        SortAlgorithm selectionSort= new SelectionSort();

        Integer[] input = new Integer[]{5,4,3,2,1};

        selectionSort.sort(input);
        Assert.assertArrayEquals(new Integer[]{1,2,3,4,5}, input);
    }


    @Test
    public void findSmallerRetornaMenorValor() {

        SelectionSort selectionSort= new SelectionSort();
        Integer[] input = new Integer[]{5,4,3,2,1};

        int smaller = selectionSort.findSmaller(0, input, Comparator.naturalOrder());

        Assert.assertEquals(4, smaller);
    }
}

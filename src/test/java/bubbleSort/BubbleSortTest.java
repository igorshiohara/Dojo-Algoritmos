package bubbleSort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void arrayVazio() {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.setArray(new int[]{});
        assertArrayEquals(new int[]{}, bubbleSort.ordenar());
    }

    @Test
    public void arrayComUmElemento() {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.setArray(new int[]{5});
        assertArrayEquals(new int[]{5}, bubbleSort.ordenar());
    }

    @Test
    public void arrayComCincoElementos() {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.setArray(new int[]{5, 4, 2, 1, 3});
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, bubbleSort.ordenar());
    }

}

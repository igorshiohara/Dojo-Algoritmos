package sorting;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void arrayVazio() {

        BubbleSort bubbleSort = new BubbleSort();

        Integer[] input = new Integer[]{};

        bubbleSort.sort(input);
        assertArrayEquals(new Integer[]{}, input);
    }

    @Test
    public void arrayComUmElemento() {

        BubbleSort bubbleSort = new BubbleSort();

        Integer[] input = new Integer[]{1};

        bubbleSort.sort(input);
        assertArrayEquals(new Integer[]{1}, input);
    }

    @Test
    public void arrayComCincoElementos() {

        BubbleSort bubbleSort = new BubbleSort();

        Integer[] input = new Integer[]{5,4,3,2,1};

        bubbleSort.sort(input);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, input);
    }

    @Test
    public void arrayComCincoElementosInvertido() {

        BubbleSort bubbleSort = new BubbleSort();
        Integer[] input = new Integer[]{1,2,3,4,5};

        bubbleSort.sort(input, new InteirosDecrescente());

        assertArrayEquals(new Integer[]{5,4,3,2,1}, input);

    }

    @Test
    public void pessoa() {


        Pessoa p1 = new Pessoa(10, "P1");
        Pessoa p2 = new Pessoa(5, "P2");

        Pessoa[] pessoas = new Pessoa[] { p1, p2 };


        SortAlgorithm sorter = new BubbleSort();

        sorter.sort(pessoas);

        System.out.println(Arrays.toString(pessoas));
    }


    class InteirosDecrescente implements Comparator<Integer> {

        public int compare(Integer o1, Integer o2) {
            return Integer.compare(o2, o1);
        }
    }

    class Pessoa implements Comparable<Pessoa> {

        private final Integer age;
        private final String name;

        public Pessoa(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Pessoa{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Pessoa outra) {
            if (this.age < outra.age) return -1;
            return 1;
        }

    }

}

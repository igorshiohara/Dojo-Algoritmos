package sorting;

import java.util.Comparator;

public interface SortAlgorithm {

    <T extends Comparable<T>> void sort(T[] array);

    <T> void sort(T[] array, Comparator<T> comparator);


}

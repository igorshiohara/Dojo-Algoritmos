package sorting;

import java.util.Comparator;

public interface SortAlgorithm {

    default <T extends Comparable<T>> void sort(T[] array) {
        sort(array, Comparator.naturalOrder());
    }

    <T> void sort(T[] array, Comparator<T> comparator);

}

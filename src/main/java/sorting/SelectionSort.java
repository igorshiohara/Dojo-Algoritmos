package sorting;

import java.util.Comparator;

public class SelectionSort implements SortAlgorithm {

    @Override
    public <T> void sort(T[] array, Comparator<T> comparator) {
        if (array.length > 1) {
            for (int i = 0; i < array.length; i++) {
                int smaller = findSmaller(i, array, comparator);
                SortingUtil.swap(array, i, smaller);
            }
        }
    }

    <T> int findSmaller(int fromPosition, T[] array, Comparator<T> comparator) {
        int pivot = fromPosition;
        for (int j = fromPosition + 1; j < array.length; j++) {
            if (comparator.compare(array[pivot], array[j]) > 0) {
                pivot = j;
            }
        }
        return pivot;
    }

}

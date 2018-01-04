package sorting;

import java.util.Comparator;

public class InsertionSort implements SortAlgorithm {

    @Override
    public <T> void sort(T[] array, Comparator<T> comparator) {
        for(int i = 1; i < array.length; i++){
            for (int j = i; j > 0; j--) {
                if (comparator.compare(array[j], array[j - 1]) < 0) {
                    SortingUtil.swap(array, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "InsertionSort";
    }

}

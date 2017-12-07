package sorting;

import java.util.Comparator;

public class InsertionSort implements SortAlgorithm {

    @Override
    public <T extends Comparable<T>> void sort(T[] array) {
        for(int i = 1; i < array.length; i++){
            for (int j = i; j > 0; j--) {
                if (array[j].compareTo(array[j-1]) < 0) {
                    swap(array, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    private <T> void swap(T[] array, int j, int i){
        T aux = array[j];
        array[j] = array[i];
        array[i]= aux;
    }

    @Override
    public <T> void sort(T[] array, Comparator<T> comparator) {
        throw new UnsupportedOperationException("Not Implemented Yet");
    }

}

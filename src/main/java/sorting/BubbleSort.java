package sorting;

import java.util.Comparator;

public class BubbleSort implements SortAlgorithm {

    private <T> void troca(T[] array, int j, int i){
        T aux = array[j];
        array[j] = array[i];
        array[i]= aux;
    }

    public <T extends Comparable<T>> void sort(T[] array) {
        boolean didChange = false;
        for (int j = array.length-1;  j >= 1; j--){
            didChange  = false;
            for (int i = 0;  i < j; i++) {
                if (array[i].compareTo(array[i+1]) > 0) {
                    troca(array,i+1, i);
                    didChange = true;
                }
            }
            if(!didChange){
                break;
            }
        }
    }

    public <T> void sort(T[] array, Comparator<T> comparator){
        boolean didChange = false;
        for (int j = array.length-1;  j >= 1; j--){
            didChange  = false;
            for (int i = 0;  i < j; i++) {
                if (comparator.compare(array[i], array[i+1]) > 0) {
                    troca(array,i+1, i);
                    didChange = true;
                }
            }
            if(!didChange){
                break;
            }
        }
    }
}

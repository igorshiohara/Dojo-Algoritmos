package sorting;

import java.util.Comparator;

public class BubbleSort implements SortAlgorithm {

    public <T> void sort(T[] array, Comparator<T> comparator){
        boolean didChange;
        for (int j = array.length-1;  j >= 1; j--){
            didChange  = false;
            for (int i = 0;  i < j; i++) {
                if (comparator.compare(array[i], array[i+1]) > 0) {
                    SortingUtil.swap(array,i + 1, i);
                    didChange = true;
                }
            }
            if(!didChange){
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "BubbleSort";
    }

}

package sorting;

class SortingUtil {

    private SortingUtil() {
        super();
    }

    static <T> void swap(T[] array, int j, int i){
        T aux = array[j];
        array[j] = array[i];
        array[i]= aux;
    }

}

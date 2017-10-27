package bubbleSort;

import java.util.Arrays;

public class BubbleSort {

    private int[] array;
    private int aux;

    private void troca(int j, int i){
        aux = array[j];
        array[j] = array[i];
        array[i]= aux;
    }

    public int[] ordenar() {
        boolean didChange = false;
        for (int j = array.length-1;  j >= 1; j--){
            didChange  = false;
            for (int i = 0;  i < j; i++) {
                if (array[i] > array[i+1]) {
                    troca(i+1, i);
                    didChange = true;
                }
            }
            if(!didChange){
                break;
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}

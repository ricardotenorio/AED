package sort;

public class SelectionSort {
    public static <E extends Comparable<E>> void sort(E[] array) {
        E max;
        E aux;
        int arraySize = array.length;
        int maxIndex;

        for (int i = 0; i < arraySize; i++) {
            max = array[0];
            maxIndex = 0;

            for (int j = 1; j < arraySize - i; j++) {
                if(array[j].compareTo(max) > 0) {
                    max = array[j];
                    maxIndex = j;
                }
            }

            aux = array[arraySize - i - 1];
            array[arraySize - i - 1] = max;
            array[maxIndex] = aux;

        }
    }
}

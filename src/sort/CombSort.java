package sort;

public class CombSort {
    private static final double SHRINK_FACTOR = 1.3;

    public static <E extends Comparable<E>> void sort(E[] array) {
        E aux;
        int arraySize = array.length;
        int gap = arraySize;
        boolean swapped;

        while (true) {
            gap = (int) (gap / SHRINK_FACTOR);
            swapped = false;

            for (int i = 0; i < arraySize - gap; i++) {
                if (array[i].compareTo(array[i + gap]) > 0) {
                    aux = array[i];
                    array[i] = array[i + gap];
                    array[i + gap] = aux;

                    swapped = true;
                }
            }

            if (!swapped && gap <= 1) {
                break;
            }
        }
    }
}

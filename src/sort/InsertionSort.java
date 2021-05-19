package sort;

public class InsertionSort {
    public static <E extends Comparable<E>> void sort(E[] array) {
        E value;
        int position;

        for (int i = 1; i < array.length; i++) {
            value = array[i];
            position = i;

            for (int j = i - 1; j >= 0; j--) {
                if(value.compareTo(array[j]) < 0) {
                    array[position] = array[j];

                    position--;
                } else {
                    break;
                }
            }

            array[position] = value;
        }
    }
}

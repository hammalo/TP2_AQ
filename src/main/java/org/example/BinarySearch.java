package org.example;
public class BinarySearch {
    public static int binarySearch(int[] array, int element) {
        if (array == null) {
            throw new NullPointerException("Array must not be null");
        }

        int low = 0;
        int high = array.length - 1;

        while (low <= high) { // Modifié pour inclure également le cas où low est égal à high
            int mid = low + (high - low) / 2; // Utilisation de cette formule pour éviter le débordement en cas de grande taille de tableau

            if (array[mid] == element) {
                return mid;
            } else if (array[mid] < element) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}

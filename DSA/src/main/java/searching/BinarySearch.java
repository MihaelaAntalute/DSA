package searching;

import java.lang.reflect.Array;

public class BinarySearch {
    //search O(log(N)) T,O(1) S- o de log N  time,o de 1 space
    public static int binarySearching(int[] array, int target, int left, int right) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (target == array[middle]) {
                return middle;
            } else if (target < array[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearching(a,8,0,a.length-1));

    }
}

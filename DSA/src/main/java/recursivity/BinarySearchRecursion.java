package recursivity;

public class BinarySearchRecursion {


    public static int binarySearching(int[] array, int target, int left, int right) {
        if(right <= left) {
            return -1;
        }
            int middle = (left + right) / 2;
            if (target == array[middle]) {
                return middle;
            } else if (target < array[middle]) {
               return binarySearching(array, target, left, middle- 1);
            } else {
               return binarySearching(array, target, middle + 1, right);
            }
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearching(a,5,0,a.length-1));
    }



}

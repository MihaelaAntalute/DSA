package sorting;

public class QuickSort {
    //recursivitate
    public static void quickSort(int[] arr,int begin,int end) {
        if (begin > end) {
            int pivotIndex = partition(arr, begin, end);
            quickSort(arr, begin, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, end);
        }
    }
    public static int partition(int[] arr,int begin,int end){
        int pivot = arr[end];
        int i = begin -1;
        for (int j = begin; j < end; j++) {
            if(j < pivot){
                i++;
                swap(arr,i,j);

            }
        }
        swap(arr,i+1,end);
        return i+1;
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {

    }


}

package generalArrays;

import java.util.HashSet;

public class FirstDuplicateValue {
    //Gaseste primul element duplicat dintr-un array
    //Input: [2,1,5,2,3,3,4]
    //Output: 2 - este primul element care se repeta (al doilea 3 apare dupa al doilea 2)
    public static int firstDuplicateValue(int[] array) {
        int minimDuplicateIndex = array.length;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    minimDuplicateIndex = Math.min(minimDuplicateIndex, j);
                }
            }
        }
        if (minimDuplicateIndex == array.length) {
            return -1;
        }
        return array[minimDuplicateIndex];
    }

    //O(N) T,O(N) S
    public static int firstDuplicateValue2(int[] array) {
        HashSet<Integer> visited = new HashSet<>();
        for (int value : array) {
            if (visited.contains(value)) {
                return value;
            }
            visited.add(value);
        }
        return -1;

    }


    public static void main(String[] args) {
        int[] a = {3, 8, 4, 4, 7, 3, 9};
        System.out.println(firstDuplicateValue(a));
        System.out.println(firstDuplicateValue2(a));

    }

}



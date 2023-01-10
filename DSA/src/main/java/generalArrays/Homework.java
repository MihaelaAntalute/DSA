package generalArrays;

import java.util.HashSet;

public class Homework {

    public static void main(String[] args) {
        //Ex1
        int[] array1 = {-5, -5, 2, 3, -1};
        //    System.out.println(validateSubsequenceWithSum(array1, 0));

        //Ex2
        int[] array2 = {-1, 5, 10, 20, 28, 3};
        int[] array3 = {26, 134, 135, 15, 17};
       // System.out.println(getMinimSumBy2Numbers(array2, array3));
        //Ex3
        int[] array4 = {1, 2, 5, 7, 9};
        //  System.out.println(getFirsPair(array4,12));

        //Ex4
        int[] array5 = {10, 15, -4, 6, 18, 34, 56, 48};
        System.out.println();
    }

    //Ex1
    //Subsir de suma 0
    //Scrie o functie care sa determina daca exista un subsir cum suma 0 intr-un array.
    //
    //Input: [-5,-5,2,3,-1]
    //Output: true - subsitul [-5,2,3] are suma 0

    //ok
    public static boolean validateSubsequenceWithSum(int[] a, int sum) {
        HashSet<Integer> b = new HashSet<>();
        for (int i = 1; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                b.add(a[0]);
                int number = a[0];
                int negativeNumber = -a[0];
                int sum2 = a[i] + a[j];
                if (negativeNumber == sum2 && number + sum2 == sum) {
                    b.add(i);
                    b.add(j);
                    System.out.println(b);
                    return true;
                }
            }
        }
        return false;
    }

    //Ex2
    //Cea mai mica diferenta dintre 2 array-uri
    //Daca ai 2 array-uri, gaseste elementele (unul din primul si celalalt din al doilea) care sa dea diferenta minima
    //
    //Input:
    //Arr1: [-1,5,10,21,28,3]
    //Arr2: [26,134,135,15,17]

    //-1,3,5,10,21,28
    //15,17,24,30,13
    //
    //Output: [28,26]

//    public static HashSet<Integer> getMinimDifferenceBy2Numbers(int[] a, int[] b) {
//        HashSet<Integer> c = new HashSet<>();
//        int diff = 0;
//
//    }

    //Ex3
    // gaseste prima pereche care are rezutatul sumei 12
    //[1,2,5,7,9]
    //rezultatul e 5,7
    //for in for
    //folosim un set,luam ceva ajutator
    // parcurgem si verificam daca un element,adunat cu altul da suma cautata
    //parcurg arrayul si x+y = 12; y = 12-x;
    //cu setl ajutator parcurg si vad daca 12 minus nr meu este deja in set
    //for
    // if(sum- element.contains(set))
    // else{set.add(element)}

    //ok
    public static HashSet<Integer> getFirsPair(int[] a, int sum) {
        HashSet<Integer> b = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (sum == a[i] + a[j]) {
                    b.add(a[i]);
                    b.add(a[j]);
                    return b;
                }
            }

        }
        return null;
    }

    //Ex4
    //Cele mai mari 3 numere dintr-un array
    // todo luam array-ul si in sortam apoi luam ultimele 3 numere din el
    public static HashSet<Integer> getBiggest3Numbers(int[] a) {
        HashSet<Integer> c = new HashSet<>();
        for (int number : a) {
            c.add(number);
        }
       return c;

    }

    //Ex5
    //Patratele elementelor sortate


    // Ex6
    //daca sortam inainte si avem 2 pointeri
    //ex avem un array,il sortam si vrem sa avem doi pointeri left si rigth
    //pot sa iau suma 10,e mai mare ca suma care o caut eu,adik 9
    //sort
    //while(left < right)
    // fac suma,daca e egala ies,daca e mai mica decat targhetul de suma atunci left ++
    //else daca suma mai mare ca targhetul right++


}

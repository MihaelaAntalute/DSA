package generalArrays;

public class ValidateSubsequence {
    //Subsir al unui array (validate subsequence)
    //Avand la dispoizitie doua array-uri, verifica daca al doilea este subsir al primului.
    //De exemplu, daca array-ul [1,3,4] este subsir al array-ului [1,2,3,4]
    //Dar si [2,4] este subsir al array-ului [1,2,3,4].
    //E nevoie sa se pastreze ordinea, dar elementele nu trebuie sa fie neaparat consecutive.
    //
    //Input:
    //array1: [5,1,2,6,25,5,-1,8,10]
    //array2: [1,6,-1,10]
    //
    //Output: true (array2 este subsir al lui array1)

    //solutia1.generam toate subArrayurile()
    //solutia 2. de a avea 2 indici,compar 1 cu 5,daca sunt egale,trec mai departe,
    // daca nus egale,merg la urmatorul doar cu un indecs
    //cand sunt egale,mut indicele
    //solutia 3,



    public static boolean validateSubsequence(int[] a, int[] b) {
        int p1 = 0, p2 = 0;
        while (p1 < a.length && p2 < b.length) {
            if (b[p2] == a[p1]) {
                p2++;
            }
            p1++;
        }
        return p2 == b.length;
    }

    public static void main(String[] args) {
        int[] array1 = {5, 1, 2, 6, 25, 5, -1, 8, 10};
        int[] array2 = {1, 6, -1, 10};
        System.out.println(validateSubsequence(array1,array2));
    }


}

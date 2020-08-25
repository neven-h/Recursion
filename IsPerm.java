public class IsPerm {
    //this is the solution appears in the student folder of the course. I suppose that it's not true
    //because there's a problem with line 37 -- indexB is not initialized and it's not clear for me how to fix this problem  


    //wrapper function --
    public static boolean isPermutation(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        return isPermutationA(a, b, 0);
    }


    private static boolean isPermutationAB(int[] a, int[] b, int indexA, int indexB) {
        // if we reached the end of array b and we'rent able to find b element in array a;
        if (indexB >= b.length)
            return false;

        if (a[indexA] == b[indexB]) {
            if (indexA != indexB) {
                int t = b[indexA];
                b[indexA] = b[indexB];
                b[indexB] = t;
            }
            return true;
        }
        return isPermutationAB(a, b, indexA, indexB + 1);
    }

    private static boolean isPermutationA(int[] a, int[] b, int indexA) {
        // if we reached the end of array a and b is indeed a permutation of a
        if (a.length <= indexA) {
            return true;
        }
        //try to arrange array b to the current index - we'll keep searching only for index greater then current index
        if (!isPermutationAB(a, b, indexA, indexB)) {  //
            return false;
        }
        return isPermutationA(a, b, indexA + 1);


    }
}

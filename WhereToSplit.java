public class WhereToSplit {

    public static int where(int[] vec) {
        if (vec.length == 0 || vec.length == 1)
            return -1;
        
        return where(vec, 0, 0, 0, 0, vec.length - 1);
    }

    public static int where(int[] vec, int index, int sumLeft, int left, int sumRight, int right) {
        if(right <= 1 || right < index) //if we reached the end of the array
            return -1;

        if(right -1 == left){
            //if we reached to the index where the difference between right and left is 1,
            //then if sumleft == sumright, we found an index which divides the array into 2 equals sets. if not - such index
            // does not exists
           return (sumLeft == sumRight)?  index: -1;
        }

        int temp1 = where(vec, index + 1, sumLeft + vec[left], left + 1, sumRight, right);
        int temp2 = where(vec, index, sumLeft, left, sumRight + vec[right], right - 1);

        //not sure if to return temp1, temp2 or what exactly

    }
}

public class Ways {


    public static int ways(int k, int n) {
        return ways(k, n, 0);
    }

    public static int ways(int k, int n, int location) {
        if (k == 0) {
            return 1;
        
        //original code as appears in the answers includes the next 3 rows:
        else {
           return 0;
       }
        }
        return ways(k - 1, n, location + 1) + ways(k - 1, n, location - 1);
    }
}

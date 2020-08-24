public class Ways {

      public static int ways(int k, int n, int location) {
        if (k == 0) {
            if (location == n) {
                return 1;
            } else {
                return 0;
            }
        }
        return ways(k - 1, n, location + 1) + ways(k - 1, n, location - 1);
    }

}


package BinarySearch;

public class NthRoot {

    public static long Power(int x, int n) {
        long result = 1;

        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }

    public static Long FindNthroot(int x, int n) {
        int low = 0;
        int high = n;
        long ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            long midPower = Power(mid, n);

            if (midPower == x) {
                ans = midPower;
            }
            


            if (midPower < x) {
                ans = midPower;
                low = mid + 1;

            } else {
                high = mid - 1;
            }

        }

        return ans;

    }

    public static void main(String[] args) {

    }
}
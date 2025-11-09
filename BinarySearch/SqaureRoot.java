package BinarySearch;

public class SqaureRoot {

    // brust force approach --- o(n) time complexity;
    public static int FindSquareRoot(int n) {

        int i = 1;
        ;
        while (i * i <= n) {
            i++;
        }

        return i - 1;

    }

    // optimal approach - O(logn)

    public static int FindSquare(int n) {

        int low = 0;
        int high = n / 2;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (mid* mid == n) {
                result = mid;
            }
            if (mid * mid < n) {
                low = mid + 1;
                result = mid;
            } else {
                high = mid - 1;
            }

        }
        return result;

    }

    public static void main(String[] args) {

        int result = FindSquare(37);
        System.out.println(result);





    }

}

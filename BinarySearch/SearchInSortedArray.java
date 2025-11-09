package BinarySearch;


public class SearchInSortedArray {

    public static int Search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                result = mid;
            }

            /// check which part is sortedd in order do the search opertion in o(logn)

            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {

                if (arr[mid] < target && target <= arr[high]) {
                    low = mid - 1;
                } else {
                    high = mid - 1;
                }

            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
        int target = 5;
        int res = Search(arr, target);

        System.out.println(res);
    }

}

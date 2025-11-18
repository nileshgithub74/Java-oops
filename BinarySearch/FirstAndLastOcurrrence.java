package BinarySearch;

public class FirstAndLastOcurrrence {

    public static int FindFirstOcurr(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        int first = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            
            

            if (arr[mid] == target) {
                first = mid;
                high = mid - 1;
                

            } else if (arr[mid] < target) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }

        }
        return first;
    }

    public static int FindLastOcurr(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        int last = -1;

        

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                last = mid;
                low = mid + 1;

            } else if (arr[mid] < target) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }

        }
        return last;
    }

    public static int FindCountOCurr(int[] arr, int target) {

        int firstOccurr = FindFirstOcurr(arr, target);
        if (firstOccurr == -1)
            return 0;

        int LastOcurr = FindLastOcurr(arr, target);

        return LastOcurr - firstOccurr + 1;

    }

    public static void main(String[] agrs) {
        int[] arr = { 2, 4, 4, 4, 5, 7, 7, 8 };
        int target = 4;

        int result = FindFirstOcurr(arr, target);
        int ans = FindLastOcurr(arr, target);
        System.out.println(result);
        System.out.println(ans);

        int count = FindCountOCurr(arr, target);
        System.out.println(count);

    }

}





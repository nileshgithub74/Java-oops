package BinarySearch;

// Dutch National Flag alogrithm;

public class Sort0_1And2 {

    public static void Swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void Sort(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int mid = 0;

        // if element is 0;

        while (mid < high) {

            if (arr[mid] == 0) {
                Swap(low, mid, arr);
                low++;
                mid++;

            } else if (arr[mid] == 1) {
                mid++;
            } else {
                Swap(mid, high, arr);
                high--;
            }

        }

    }

    public static void main(String[] args) {

        int arr[] = { 0, 1, 0, 2, 0, 2, 1, 0, 1, 2, 1, 0, 1,2,0,2 };
       Sort(arr);

       for(int x: arr){
        System.out.print(x +" ");
       }



    }

}

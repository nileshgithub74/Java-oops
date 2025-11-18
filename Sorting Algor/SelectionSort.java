
public class SelectionSort {



    // time complexity = 0(n2)
    // best case : 0(n2)



    public static void Swap(int i, int j, int[] arr) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static int[] Sorting(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int miniIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[miniIndex]) {
                    miniIndex = j;

                }
            }

            Swap(i, miniIndex, arr);

        }
        return arr;
    }

    public static void main(String[] agrs) {
        int arr[] = { 3, 5, 2, 4, 12, 8, 16, 13 };
        int[] ans = Sorting(arr);

        for (int x : ans)
            System.out.print(x + " ");

    }

}

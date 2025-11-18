public class BubbleSort {

    public static void swap(int i, int j, int[] arr) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static int[] Sort(int[] arr) {
        int n = arr.length;
        boolean isSorted = false;

        for (int i = n - 1; i >= 0; i--) {

            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(j , j+1, arr);
                    isSorted = true;
                }
            }


        if(isSorted == false){
                break;
            }

           
        }

         
        return arr;
    }

    public static void main(String[] args) {

    }

}

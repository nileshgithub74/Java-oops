public class ReaarangeElement {

    public static int[] Rearrange(int[] arr) {
        int n = arr.length;
        int[] positiveArray = new int[n / 2];
        int[] negativeArray = new int[n / 2];

        for (int i = 0; i < n ; i++) {

            if(i % 2== 0){
                negativeArray[i] = i;
            }



        }
        return arr;

    }

    public static void main(String[] args) {


        int[] arr ={3,1,-2,-5,2,-4};
        int[] result = Rearrange(arr);

        for(int x : result){
            System.out.print(x+ " ");
        }
    }
}

package BinarySearch;

public class MinInSortedRotatedArray {


    public static int  FindMin(int[] arr){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = Integer.MAX_VALUE;


        while(low < high){

            int mid = (low+ high)/2;
            
            if(arr[mid] < ans){
                ans = mid;
                
            }

            if(arr[low] <= arr[mid]){
                if(arr[low]< ans)ans = low;
                
                    low = mid+1;
                

            }else{
                if(arr[mid] < ans){
                    ans = mid;
                }
                    high = mid-1;
                
            }


        }
        return ans;
    }




    public static void main(String[] args){

        int[] arr = {4,5,6,7,0,1,2};
        int ans = FindMin(arr);
        System.out.println(ans);

    }
    
}

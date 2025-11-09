package BinarySearch;

public class BinaryBoundProblem {




    // condition for lower bound : first index which is arr[i] >= x;

    public static int FindLowerBound(int[] arr, int x){
        int low = 0;
        int high = arr.length -1;
        int ans = arr.length;

        while(low<=high){
            int mid = (low+high)/2;


            if(arr[mid] >=x){
                ans = mid;
                high  = mid-1;

            }else{
                low = mid +1;
            }

        }
        return ans;
    }


    // upper bound : first index which is greator than the given values. ie. arr[i] > x;


    public static int FindUpperBound(int[] arr, int x){
        int low = 0;
        int high = arr.length -1;
        int ans = arr.length;

        while (low <= high) {
            int mid = (low+high)/2;

            if(arr[mid] > x){
                ans = mid;
                high = mid-1;

            }else{
                low = mid+1;
            }
            
        }
        return ans;
    }
    


    // ceil : same the lower bound :  smallest element which is greator or equal to givenn values.


    public static int FindCeil(int[] arr, int x){
        int low =0;
        int high = arr.length -1;
        int ceil = -1;


        while(low <= high){
            int mid =(low+high)/2;

            if(arr[mid] >= x){
                ceil =  arr[mid];
                high = mid-1;

            }else{
                low = mid+1;
            }


        }
        return ceil;
    }
    
         

    public static void main(String[] args){
           int[] arr = {1, 2, 4, 6, 10};

           int x = 5;
           int x1 = 6;
           int result = FindLowerBound(arr, x);
           int  result2 = FindUpperBound(arr,x1);

           System.out.println("lower bound : " +result);
           System.out.println("Upper bound : " +result2);


    }
    
}

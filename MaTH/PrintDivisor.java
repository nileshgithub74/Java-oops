public class PrintDivisor {

    public static void PrintAllDivisor(int n){

        for(int i =1; i *i <=n; i++){
            if(n  % i == 0){
                System.out.print(i +" ");

                if(n / i != i){
                    System.out.println(n/i);
                }
            }

        }

    }



    public static void main(String[] args){
        PrintAllDivisor(36);

    }
    
}

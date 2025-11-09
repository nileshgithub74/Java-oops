class PrimeNumber{


    public static boolean  checkPrime(int number){

        int count = 0;

        for(int i =1; i *i<=number; i++){

            if(number %i ==0){
                count++;
                if(number/ i != i ){
                    count++;
                }
            }
           
        }

        if(count == 2)return true;
        return false;


    }



    public static void main(String[] args){
        boolean ans = checkPrime(19);
        System.out.println(ans);

    }
}
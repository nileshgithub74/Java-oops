
class Digit {

    public static int FindDigit(int number) {


        // example = 134224;
        // and if we want to reverse the word :  reversed 

        int  reverse= 0;
        int lastDigit =0;


        while (number != 0) {
             lastDigit  = number % 10;
            reverse=   reverse *10 + lastDigit;

            number = number / 10;
        }
        return reverse;

    }


    public static void main(String[] args) {

        int number = 12345;
       int result =  FindDigit(number);
       System.out.println(result);

        
    }

}

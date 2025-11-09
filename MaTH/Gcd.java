

public class Gcd {

    // eculidean alogrithm :  gcd(a,b) = gcd(a-b, b) : if(a>b)
    // and so on at last we will find that  a-b = a%b if(a>b);
    // and at last any of one values get 0 then other will be the ans;

    public static int FindGcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b)
                a = a % b;
            else
                b = b % a;

        }
        if (a == 0)
            return b;
        else
            return a;
    }

    public static void main(String[] args){
        int result = FindGcd(50,10);
        System.out.println(result);
    }

}

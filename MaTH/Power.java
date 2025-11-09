public class Power {
    public static int Findpower(int num, int n) {

        int ans = 1;

        while (n> 0) {
            if (n % 2 == 0) { // n is even ;
                n = n / 2;
                num = num * num;

            } else {   // n is odd;
                ans = ans * num;
                n = n - 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int result = Findpower(3, 2);
        System.out.println(result);

    }

}

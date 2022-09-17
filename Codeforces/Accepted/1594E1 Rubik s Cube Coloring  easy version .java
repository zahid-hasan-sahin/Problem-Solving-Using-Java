import java.util.ArrayList;
import java.util.Scanner;

public class cfContest1594 {

    static long power(long x, long y, long p) {
        long res = 1;
        x = x % p;

        if (x == 0) {
            return 0;
        }
        while (y > 0) {

            if ((y & 1) != 0) {
                res = (res * x) % p;
            }

            y = y >> 1;

            x = (x * x) % p;
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        long n = scan.nextInt();
        long mod = 1000000007;
        long res = 6;
        long p = (long) Math.pow(2, n);
        long r = power(4, p - 2, mod);
        res = ((res % mod) * (r % mod)) % mod;
        System.out.println(res);

    }
}
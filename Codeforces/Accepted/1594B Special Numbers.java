import java.util.Scanner;

public class cfContest1594 {

    public static long log2(long N) {

        long result = (long) (Math.log(N) / Math.log(2));

        return result;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long n = scan.nextLong();
            long k = scan.nextInt();
            long res = 0;
            long mod = 1000000007;
            while (k != 0) {
                long p = log2(k);
                long r = 1;
                long r1 = 1;
                for (int i = 0; i < p; i++) {
                    r = ((r % mod) * (n) % mod) % mod;
                    r1 *= 2;
                }
                res = ((r % mod) + (res % mod)) % mod;
                k -= r1;
            }
            System.out.println(res);
        }

    }
}
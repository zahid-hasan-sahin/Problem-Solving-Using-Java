import java.util.Scanner;

public class NewYearandPermutation {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long mod = scan.nextLong();
        long[] fact = new long[n + 1];
        fact[1] = 1;
        for (int i = 2; i <= n; i++) {
            fact[i] = ((fact[i - 1] % mod) * (i % mod)) % mod;
        }
        long res = 0;
        for (int i = 1; i <= n; i++) {
            long cal = ((fact[i] % mod) * (fact[n - i + 1] % mod)) % mod;
            cal = ((cal % mod) * ((n - i + 1) % mod)) % mod;
            res = ((res % mod) + (cal % mod)) % mod;
        }
        System.out.println(res);
    }
}
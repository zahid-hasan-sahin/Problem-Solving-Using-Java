import java.awt.event.InputEvent;
import java.lang.Thread;
import java.util.Scanner;
import java.awt.Robot;

public class A {

    static int mod = 1000000007;
    static int big = 0;
    static int small = 0;
    static long[] f = new long[10010];
    static long[] inv = new long[10010];

    static int modInv(long a) {
        long k = a;
        long b = mod - 2;
        long res = 1;
        while (b != 0) {
            if (b % 2 == 1) {
                --b;
                res = ((res % mod) * (k % mod)) % mod;
            }
            k = ((k % mod) * (k % mod)) % mod;

            b = b / 2;
        }
        return (int) res % mod;
    }

    static int nCr(int n, int r) {
        long res = 1;
        if (r > n - r) {
            r = n - r;
        }
        for (int i = 0; i < r; i++) {
            res = ((res % mod) * ((n - i) % mod)) % mod;
            res = ((res % mod) * (inv[i + 1] % mod)) % mod;

        }
        return (int) res;
    }

    static void bn(int pos, int n) {
        int l = 0;
        int r = n;
        while (l < r) {
            int m = (l + r) / 2;
            if (m <= pos) {
                if (m != pos) {
                    ++small;
                }
                l = m + 1;
            } else {
                ++big;
                r = m;
            }
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        f[0] = inv[0] = 1;
        for (int i = 1; i < 10010; i++) {
            f[i] = ((f[i - 1] % mod) * (i % mod)) % mod;
            inv[i] = (modInv(i)) % mod;
        }
        int n = scan.nextInt();
        int x = scan.nextInt();
        int pos = scan.nextInt();
        bn(pos, n);
        int hSmall = x - 1;
        int hBig = n - x;
        int nUse = n - small - big - 1;
        long res = ((nCr(hBig, big) % mod)) % mod;
        res = ((res % mod) * (f[big] % mod)) % mod;
        long sm = ((((nCr(hSmall, small) % mod) * (f[small] % mod)) % mod) % mod) % mod;
        res = ((res % mod) * (sm % mod)) % mod;
        res = ((res % mod) * (f[nUse] % mod)) % mod;
        System.out.println(res);
    }
}
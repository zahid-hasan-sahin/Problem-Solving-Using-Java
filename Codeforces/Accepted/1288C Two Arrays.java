import java.util.Scanner;

public class A {

    public static long modInv(long a, long n, long m) {
        long res = 1;
        while (n != 0) {
            if (n % 2 == 1) {
                res = ((res % m) * (a % m)) % m;
                --n;
            }
            a = ((a % m) * (a % m)) % m;
            
            n = n / 2;
        }
        return res;
    }
    static long c(int n, int k) {
        int m = 1000000007;
        long res = 1;
        if (k > n - k) {
            k = n - k;
        }
        for (int i = 0; i < k; ++i) {
            res = ((res % m) * ((n - i) % m)) % m;
            res = ((res) * (modInv((i + 1), m - 2, m))) % m;
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        System.out.println(c(n+(2*m)-1,2*m));
    }

}
import java.util.Scanner;

public class TwoArrays {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int c = n + m + 10;
        int r = n + m + 10;
        int[][] a = new int[c][r];
        for (int i = 0; i < c; i++) {
            a[i][0] = 1;
            a[i][i] = 1;
        }
        int mod = 1000000007;
        for (int i = 2; i < c; i++) {
            for (int j = 1; j < r; j++) {
                a[i][j] = ((a[i - 1][j - 1] % mod) + (a[i - 1][j] % mod)) % mod;
            }
        }
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
            }
        }
        System.out.println(a[n + (2 * m) - 1][2 * m]);

    }

}
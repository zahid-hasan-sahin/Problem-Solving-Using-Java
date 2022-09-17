import java.util.Scanner;

public class RecursiveQueries {

    static int f(int n) {
        String s = String.valueOf(n);
        int res = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                res *= (s.charAt(i) - '0');
            }
        }
        return res;
    }

    static int g(int n) {
        if (n < 10) {
            return n;
        }
        return g(f(n));
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[1000010];
        for (int i = 0; i < 1000010; i++) {
            a[i] = g(i);
        }
        int[][] res = new int[10][1000010];
        for (int i = 1; i <= 9; i++) {
            int k = 0;
            for (int j = 0; j < 1000010; j++) {
                if (a[j] == i) {
                    ++k;
                }
                res[i][j] = k;
            }
        }
        int t = scan.nextInt();
        while (t-- > 0) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            int p = scan.nextInt();
            System.out.println(res[p][r] - res[p][l - 1]);
        }

    }
}
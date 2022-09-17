import java.util.ArrayList;
import java.util.Scanner;

public class cfContest1551 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int[] f = new int[n + 1];
            for (int i = 0; i < n; i++) {
                f[a[i]]++;
            }
            int[] give = new int[n + 1];
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                int r = give[a[i]] + 1;
                if (r > k) {
                    continue;
                }
                res[i] = r;
                give[a[i]] = r;
            }
            int col = 0;
            int[] g = new int[k + 1];
            for (int i = 0; i < n; i++) {
                if (res[i] != 0) {
                    ++col;
                }
                ++g[res[i]];
            }
            int p = col / k;

            int[] give2 = new int[n + 1];
            int[] w = new int[n + 1];
            int[] res2 = new int[n];
            for (int i = 0; i < n; i++) {
                int r = give2[a[i]] + 1;
                if (r > k) {
                    continue;
                }
                while (w[r] == p) {
                    ++r;
                }
                res2[i] = r;
                give2[a[i]] = r;
                ++w[r];
            }
            for (int i = 0; i < n; i++) {
                System.out.print(res2[i] + " ");
            }
            System.out.println();
        }
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class NewClass5 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int f = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] < a[f]) {
                    f = i;
                }
            }
            long l = 0;
            if (f == n - 1) {
                l = n - 2;
            } else if (f == 0) {
                l = 1;
            } else {
                l = Math.min(a[f + 1], a[f - 1]);
            }
            long x = n;
            long y = x;
            long res = 0;
            for (int i = 0; i <= Math.max(l, f); i++) {
                if (i == f) {
                    res += (x * a[i]);
                } else if (i % 2 == f % 2) {
                    res += (a[i]);
                    --x;
                }
                if (i == l) {
                    res += (y * a[i]);
                } else if (i % 2 == l % 2) {
                    res += a[i];
                    --y;
                }
            }
            System.out.println(res);

        }
    }

}
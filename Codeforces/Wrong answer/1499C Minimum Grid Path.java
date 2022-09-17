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
            int l = 0;
            if (f % 2 == 0) {
                l = 1;
            }
            for (int i = l; i <= f; i += 2) {
                if (a[i] < a[l]) {
                    l = i;
                }
            }
            int k = f % 2;
            long res = 0;
            int x = n;

            for (int i = k; i <= f; i += 2) {
                if (i == f) {
                    res += (x * a[i]);
                } else {
                    res += a[i];
                    --x;
                }
            }

            k = l % 2;
            x = n;

            for (int i = k; i < l; i += 2) {
                --x;
                res += a[i];
            }

            for (int i = f - 1; i > l; i -= 2) {
                --x;
                res += a[i];
            }

            res += (x * a[l]);
            System.out.println(res);

        }
    }

}
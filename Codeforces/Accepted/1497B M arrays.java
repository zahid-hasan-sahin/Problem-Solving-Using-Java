import java.util.Arrays;
import java.util.Scanner;

public class NewClass4 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int[] b = new int[100010];
            for (int i = 0; i < n; i++) {
                ++b[a[i] % m];
            }
            long res = 0;
            int k = 0;
            int h = 0;
            for (int i = 0; i < n; i++) {
                int p = a[i] % m;
                if (b[p] > 0) {
                    if (p == 0) {
                        ++k;
                    } else if (m % 2 == 0 && p == m / 2) {
                        ++h;
                    } else {

                        int r = m - p;

                        if (b[p] > b[r]) {
                            int e = b[r] + 1;
                            b[p] -= e;
                            b[r] = 0;

                            res += b[p] + 1;
                            b[p] = 0;
                        } else if (b[r] > b[p]) {
                            int e = b[p] + 1;
                            b[r] -= e;
                            b[p] = 0;
                            res += b[r] + 1;
                            b[r] = 0;
                        } else {
                            ++res;
                            b[p] = 0;
                            b[r] = 0;
                        }
                    }

                }
            }
            if (k != 0) {
                ++res;
            }
            if (h != 0) {
                ++res;
            }
           sb.append(res+"\n");

        }
        System.out.println(sb);

    }
}
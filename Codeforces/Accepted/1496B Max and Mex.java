import java.util.Arrays;
import java.util.Scanner;

public class NewClass3 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] a = new int[n];
            int mx = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                mx = Math.max(mx, a[i]);
            }
            Arrays.sort(a);
            int p = -1;
            for (int i = 0; i < n; i++) {
                if (a[i] != i) {
                    p = i;
                    break;
                }
            }
            if (p == -1) {
                sb.append(n + k + "\n");
            } else {
                int e = (int) Math.ceil((p + mx) / 2.0);
                boolean b = false;
                for (int i = 0; i < n; i++) {
                    if (a[i] == e) {
                        b = true;
                    }
                }
                if (b) {
                    sb.append(n + "\n");
                } else {
                    sb.append(Math.min(n + 1, n + k) + "\n");
                }
            }

        }
        System.out.println(sb);

    }
}
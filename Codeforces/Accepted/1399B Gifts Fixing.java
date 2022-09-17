import java.util.Arrays;
import java.util.Scanner;

public class NewClass9 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];
            int m = Integer.MAX_VALUE;
            int p = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                m = Math.min(m, a[i]);
            }
            for (int i = 0; i < n; i++) {
                b[i] = scan.nextInt();
                p = Math.min(p, b[i]);
            }
            long res = 0;
            for (int i = 0; i < n; i++) {
                int r = Math.max(a[i] - m, b[i] - p);
                int t = Math.min(a[i] - m, b[i] - p);
                res = res + r ;
             //   System.out.println(res);
            }
            System.out.println(res);

        }

    }

}
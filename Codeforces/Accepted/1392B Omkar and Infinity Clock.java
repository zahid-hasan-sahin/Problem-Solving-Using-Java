import java.util.HashSet;
import java.util.Scanner;

public class NewClass1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            long k = scan.nextLong();
            int[] a = new int[n];
            int mx = -2000000000;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                mx = Math.max(mx, a[i]);
            }
            if (k % 2 == 1) {
                for (int i = 0; i < n; i++) {
                    System.out.print(mx - a[i] + " ");
                }
                System.out.println();
            } else {
                int[] b = new int[n];
                int m = -2000000000;
                for (int i = 0; i < n; i++) {
                    b[i] = mx - a[i];
                   
                    m = Math.max(b[i], m);
                }
                for (int i = 0; i < n; i++) {
                    System.out.print(m - b[i] + " ");
                }
                System.out.println();
            }

        }

    }

}
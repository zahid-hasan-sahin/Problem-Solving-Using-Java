import java.util.Scanner;

public class NewClass2 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next();
            int n = s.length();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.charAt(i) - '0';
            }
            int k = scan.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = 1;
            }
            for (int i = 0; i < n; i++) {
                if (a[i] == 0) {
                    if (i - k >= 0) {
                        b[i - k] = 0;
                    }
                    if (i + k < n) {
                        b[i + k] = 0;
                    }
                }
            }
            boolean ch = false;
            for (int i = 0; i < n; i++) {
                if (b[i] == 1) {
                    int r = 0;
                    if (i - k >= 0 && b[i - k] == 0) {
                        ++r;
                    }
                    if (i + k < n && b[i + k] == 0) {
                        ++r;
                    }

                    if (r == 2) {
                        ch = true;
                    }
                }
            }

            int u = 0;
            while (u < k && b[u] == 0) {
                ++u;
            }
            if (u < k) {
                int w = b[u + k];
                int e = a[u];
                if (u + k < n && w != e) {

                    ch = true;
                }
            }

            u = n - 1;
            while (u >= 0 && b[u] == 0) {

                --u;
            }
            if (n - (u + 1) < k) {
                if (u - k >= 0 && b[u - k] != a[u]) {

                    ch = true;
                }
            }

            if (ch) {
                System.out.println("-1");
            } else {

                for (int i = 0; i < n; i++) {
                    System.out.print(b[i]);
                }
                System.out.println();
            }

        }

    }
}
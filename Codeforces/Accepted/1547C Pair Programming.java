import java.util.Scanner;

public class cfContest1546 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int k = scan.nextInt();
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i < m; i++) {
                b[i] = scan.nextInt();
            }
            int[] res = new int[n + m];
            int l = 0;
            int r = 0;

            for (int i = 0; i < n + m; i++) {
                int rw = 0;

                if (l < n && (r == m || a[l] <= b[r])) {

                    res[i] = a[l];
                    ++rw;
                }
                if (rw == 0 && r < m && (l == n || b[r] <= a[l])) {

                    res[i] = b[r];
                    ++r;
                }
                if (rw != 0) {
                    ++l;
                }
            }
            int line = k;
            for (int i = 0; i < n + m; i++) {
                if (res[i] == 0) {
                    ++line;
                } else {
                    if (line < res[i]) {

                        System.out.println("-1");
                        continue k;
                    }

                }
            }
            for (int i = 0; i < n + m; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }
    }
}
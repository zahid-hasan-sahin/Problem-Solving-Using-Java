import java.util.Scanner;

public class SegmentOccurrences {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int q = scan.nextInt();
        String s = scan.next();
        String t = scan.next();
        int[] a = new int[n + 1];
        int j = 0;
        int k = 0;
        int p = 0;

        for (int i = 0; i <= n - m; i++) {
            int u = 0;
            for (int l = 0; l < m; l++) {
                if (s.charAt(i + l) == t.charAt(l)) {
                    ++u;
                }
            }
            if (u == m) {
                ++k;
            }
            a[i + 1] = k;
        }
      
        while (q-- > 0) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            int res = 0;
            if (r - m >= 0) {
                res = a[r - m + 1] - a[l - 1];
            }

            System.out.println(Math.max(res, 0));
        }
    }
}
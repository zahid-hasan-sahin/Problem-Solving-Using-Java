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

        for (int i = 1; i <= n; i++) {
            if (s.charAt(i - 1) == t.charAt(j)) {
                ++j;
            } else {
                j = 0;
            }
            if (j == m) {
                ++k;
                for (int l = i - m + 1; l <= i; l++) {
                    a[l] = k;
                }
                j = 0;
                p = i - m + 1;

            } else {
                a[i] = k;
            }
          
        }

        System.out.println();
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
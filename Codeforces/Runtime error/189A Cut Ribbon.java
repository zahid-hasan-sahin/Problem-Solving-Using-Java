import java.util.Scanner;

public class CutRibbon {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[3];
        int[] res = new int[n + 1];
        for (int i = 0; i < 3; i++) {
            a[i] = scan.nextInt();
            res[a[i]] = 1;
        }
        for (int i = 1; i <= n; i++) {
            int m = 0;
            boolean ch = false;
            for (int j = 0; j < 3; j++) {
                if (i - a[j] >= 0 && res[i - a[j]] != 0) {
                    ch = true;
                    m = Math.max(res[i - a[j]], m);
                }
            }
            if (ch) {
                res[i] = m + 1;
            }

        }
        System.out.println(res[n]);
    }
}
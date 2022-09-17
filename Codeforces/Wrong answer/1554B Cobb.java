import java.util.Scanner;

public class cfContest1554 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            long k = scan.nextInt();
            long res = Integer.MIN_VALUE;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int[] f = new int[n + 1];
            for (int i = n - 1; i >= Math.max(0, n - 10001); i--) {
                if (f[a[i]] == 1) {
                    continue;
                }
                for (int j = i - 1; j >= Math.max(0, n - 10001); j--) {
                    res = Math.max(res, (i + 1) * (j + 1) - k * (a[i] | a[j]));
                }
                f[a[i]] = 1;
            }
            System.out.println(res);
        }

    }
}
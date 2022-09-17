import java.util.HashSet;
import java.util.Scanner;

public class cfContest1573 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = scan.nextInt();
            }
            int[] inda = new int[2 * n + 1];
            int[] indb = new int[2 * n + 1];
            for (int i = 0; i < n; i++) {
                inda[a[i]] = i;
            }

            for (int i = 0; i < n; i++) {
                indb[b[i]] = i;
            }
            int mn = 1000000000;
            int res = 1000000000;
            for (int i = n * 2 - 1; i >= 1; i -= 2) {
                mn = Math.min(mn, indb[i + 1]);
              
                res = Math.min(mn + inda[i], res);
            }
            System.out.println(res);
        }
    }
}
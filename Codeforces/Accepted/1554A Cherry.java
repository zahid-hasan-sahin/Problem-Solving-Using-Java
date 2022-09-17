import java.util.Scanner;

public class cfContest1554 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            long res = 0;
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i < n - 1; i++) {
                res = Math.max(res, a[i] * a[i + 1]);
                
            }
            System.out.println(res);

        }

    }
}
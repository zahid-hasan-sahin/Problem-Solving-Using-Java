import java.util.Scanner;

public class cfContest1704 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int x = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int mn = a[0];
            int mx = a[0];
            int c = 0;
            for (int i = 1; i < n; i++) {
                if (Math.abs(a[i] - mn) <= 2 * x && Math.abs(a[i] - mx) <= 2 * x) {
                    mn = Math.min(a[i], mn);
                    mx = Math.max(a[i], mx);
                } else {
                    mn = a[i];
                    mx = a[i];
                    ++c;
                }
            }
            System.out.println(c);
        }
    }
}
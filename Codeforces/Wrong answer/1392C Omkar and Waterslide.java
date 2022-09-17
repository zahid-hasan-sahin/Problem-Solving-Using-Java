import java.util.Scanner;

public class NewClass1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int m = 0;

            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                if (a[m] < a[i]) {
                    m = i;
                }
            }
            long res = 0;
            int mx = 0;
            for (int i = m; i < n; i++) {
                mx = Math.max(mx, a[m]-a[i]);
            }
            System.out.println(mx);
        }

    }

}
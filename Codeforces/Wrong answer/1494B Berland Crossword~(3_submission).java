import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NewClass1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();
            int k = 1000000000;
            int r = 0;
            if (n - 2 <= a) {
                k = Math.min(k, a - (n - 2));
                r += a - (n - 2);
            }
            if (n - 2 <= c) {
                k = Math.min(k, c - (n - 2));
                r += c - (n - 2);
            }
            if (b + d < r) {
                System.out.println("NO");
                continue;
            }
            r -= Math.min(b, 2);

            if (r > d) {
                System.out.println("NO");
                continue;
            }
            r = 0;
            if (n - 2 <= b) {
                r += b - (n - 2);
            }
            if (n - 2 <= d) {

                r += d - (n - 2);
            }
            if (a + c < r) {
                System.out.println("NO");
                continue;
            }
            r -= Math.min(a, 2);

            if (r > c) {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");
        }
    }
}
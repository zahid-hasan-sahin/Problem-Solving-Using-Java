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
            int k = 0;
            if (n - 2 <= a) {
                k += a - (n - 2);
            }
            if (n - 2 <= c) {
                k += c - (n - 2);
            }
           
            if (b + d < k) {
                System.out.println("NO");
                continue;
            }
            if (b + d + k > 2 * n) {
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");

        }
    }
}
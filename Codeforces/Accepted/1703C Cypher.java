import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class A {

    static int performed(int c, int n, String s) {
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'D') {
                ++c;
                if (c == 10) {
                    c = 0;
                }
            } else {
                --c;
                if (c == -1) {
                    c = 9;
                }
            }

        }
        return c;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                int b = scan.nextInt();
                String s = scan.next();
                a[i] = performed(a[i], b, s);

            }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }

}
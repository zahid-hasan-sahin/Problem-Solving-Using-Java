import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class cfContest1714 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int mx = -1;
            int p = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                if (a[i] + a[i] % 10 >= mx) {
                    p = a[i];
                    mx = a[i] + a[i] % 10;
                }
            }
            for (int i = 0; i < n; i++) {

                a[i] += a[i] % 10;
            }
            for (int i = 0; i < n; i++) {
                if (a[i] % 10 == 0 && a[i] != mx) {
                    System.out.println("NO");
                    continue k;
                }
                if (a[i] == mx) {
                    continue;
                }
                int diff = mx - a[i];

                if (a[i] % 10 == 4) {
                    diff += 2;
                } else if (a[i] % 10 == 8) {
                    diff += 6;
                } else if (a[i] % 10 == 6) {
                    diff += 14;
                }

                diff %= 20;

                if (diff == 0 || diff == 2 || diff == 6 || diff == 14) {

                } else {
                    System.out.println("NO");
                    continue k;
                }
            }
            System.out.println("YES");
        }
    }
}
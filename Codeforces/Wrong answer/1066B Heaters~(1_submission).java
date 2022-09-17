import java.util.ArrayList;
import java.util.Scanner;

public class Heaters {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();

        }

        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                x.add(i - r + 1);
                y.add(i + r - 1);
            }
        }
        boolean[] b = new boolean[n];
        int k = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                k = r + i - 1;
            }
            if (k >= i) {
                b[i] = true;
            }
        }
        k = n;
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] == 1) {
                k = i - r + 1;
            }
            if (k <= i) {
                b[i] = true;
            }
        }
        for (int i = 0; i < n; i++) {
            if (!b[i]) {

                System.out.println("-1");
                return;
            }
        }
        int res = 0;
        int rr = 0;
        int i = 0;

        for (; i < x.size() - 1; i++) {
            if (rr >= n) {
                break;
            }
            if (x.get(i) <= rr && x.get(i + 1) <= rr) {
                continue;
            }
            ++res;
            rr = y.get(i);
        }
        if (rr < n) {
            ++res;
        }
        System.out.println(res);
    }
}
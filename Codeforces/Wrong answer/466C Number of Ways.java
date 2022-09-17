import java.util.Scanner;

public class NumberofWays {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] ar = new long[n];
        long s = 0;
        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextInt();
            s += ar[i];
        }
        long[] p = new long[n];
        p[0] = ar[0];
        for (int i = 1; i < n; i++) {
            p[i] = p[i - 1] + ar[i];
        }
        if (s % 3 != 0) {
            System.out.println("0");
            return;
        }
        long k = s / 3;
        int a = -1;
        int b = -1;
        for (int i = 0; i < n; i++) {
            if (p[i] == k) {
                a = i;
                break;
            }
        }
        for (int i = a + 1; i < n; i++) {
            if (p[i] - k == k) {
                b = i;
                break;
            }
        }
        long e = 0;
        for (int i = b + 1; i < n; i++) {
            e += ar[i];
        }

        if (a == -1 || b == -1 || e != k) {
            System.out.println("0");
            return;
        }

        int l = 0;
        int r = 0;
        int u = 0;
        for (int i = a; i < b; i++) {
            if (p[i] == k) {
                ++l;
            }
        }
        for (int i = b; i < n - 1; i++) {
            if (p[i] - k == k) {
                ++r;
            }
        }

        System.out.println(l * r);
    }

}
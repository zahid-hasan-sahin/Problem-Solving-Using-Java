import java.util.Scanner;

public class NewClass6 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int sum = 0;
            int odd = 0;
            int p = 0;
            int[] v = new int[n];
            for (int i = 0; i < n; i++) {
                v[i] = scan.nextInt();
            }
            int even = 0;

            for (int i = 0; i < n - 1; i++) {
                if (v[i] % 2 == 1) {
                    ++odd;
                } else {
                    ++even;
                }
                if (v[i] == v[i + 1]) {
                    ++p;
                }
                sum += v[i];
            }
            sum +=v[n - 1];
            if (v[n - 1] % 2 == 1) {
                ++odd;
            }
            if (v[n - 2] == v[n - 1]) {
                ++p;
            }
            if ((sum % 2 == 1 && p == n) || (n != p && odd > 0 && even > 0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

}
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Division {

    static long max(long a, long b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long x = scan.nextLong();
            int y = scan.nextInt();

            HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
            for (int i = 2; i <= Math.sqrt(y); i++) {
                int p = 0;
                while (y % i == 0) {
                    y /= i;
                    ++p;
                }
                h.put(i, p);
            }
            if (y >= 2) {
                h.put(y, 1);
            }
            long res = 0;
            for (Integer k : h.keySet()) {
                int p = h.get(k);
                long c = x;
                while (c % k == 0) {
                    c /= k;
                }
                for (int i = 0; i < p - 1; i++) {
                    c *= k;
                }
                res = max(c, res);
            }
            System.out.println(res);
        }

    }

}
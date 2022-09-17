import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class UniqueBidAuction {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();

            HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                int in = scan.nextInt();
                a[i] = in;
                if (h.containsKey(in)) {
                    int k = h.get(in);
                    h.put(in, k + 1);
                } else {
                    h.put(in, 1);
                }
            }
            int k = 0;
            a: for (int p : h.keySet()) {
                if (h.get(p) == 1) {
                    for (int i = 0; i < n; i++) {
                        if (a[i] == p) {
                            System.out.println(i + 1);
                            ++k;
                            break a;

                        }
                    }
                }
            }
            if (k == 0) {
                System.out.println("-1");
            }
        }
    }
}
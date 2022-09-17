import java.util.HashMap;
import java.util.Scanner;

public class SequenceTransformation {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();

            }
            HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
            for (int i = 0; i < n - 1; i++) {
                if (a[i] != a[i + 1]) {
                    if (h.containsKey(a[i])) {
                        h.put(a[i], h.get(a[i]) + 1);
                    } else {
                        h.put(a[i], 1);
                    }
                }
            }
            if (n == 1) {
                System.out.println("0");
                continue;
            }
            if (a[n - 1] != a[n - 2] && a[0] != a[n - 1]) {
                if (h.containsKey(a[n - 1])) {
                    h.put(a[n - 1], h.get(a[n - 1]) + 1);
                } else {
                    h.put(a[n - 1], 0);
                }
            }
            if (h.size() == 0) {
                System.out.println("0");
                continue;
            }
            h.put(a[0], h.get(a[0]) - 1);
            int mn = 1000000000;
            for (int k : h.keySet()) {

                mn = Math.min(mn, h.get(k) + 1);
            }
            System.out.println(mn);

        }
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class MP3 {

    public static long log2(int N) {

        int result = (int) (Math.log(N) / Math.log(2));

        return result;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int p = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int k = 0;
        while (log2(k) * n <= p * 8 && k <= n) {
            if (log2(k) * n > p * 8) {
                --k;
                break;
            }
            ++k;
        }
        int[] f = new int[400010];
        for (int i = 0; i < n; i++) {
            ++f[a[i]];
        }
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int i = 0; i < 400010; i++) {
            if (f[i] != 0) {
                ar.add(f[i]);
            }
        }
        long sum = 0;
        int l = 0;
        int r = 0;
        long res = 0;
        while (l < ar.size() && r < ar.size()) {
            if (sum + ar.get(r) <= k) {
                sum += ar.get(r);
                ++r;
            } else {
                sum -= ar.get(l);
                ++l;
            }
            if (sum <= k) {
                res = Math.max(res, sum);
            }

        }
        System.out.println(n - res);
    }
}
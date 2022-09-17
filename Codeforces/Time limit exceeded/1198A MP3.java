import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class MP3 {

    public static long log2(int N) {

        int result = (int) Math.ceil((Math.log(N) / Math.log(2)));

        return result;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int p = scan.nextInt();
        int[] a = new int[n];
        TreeSet<Integer> t = new TreeSet<Integer>();
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            t.add(a[i]);
        }
        int k = 0;
        while (log2(k) * n <= p * 8 && k <= n) {
            ++k;
        }
        if (log2(k) * n > p * 8) {
            --k;
        }

        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            h.put(a[i], h.getOrDefault(a[i], 0) + 1);
        }
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int i : t) {
            ar.add(h.get(i));

        }
        int[] pre = new int[ar.size() + 1];
        for (int i = 1; i <= ar.size(); i++) {
            pre[i] = pre[i - 1] + ar.get(i - 1);

        }
        long res = 0;
        for (int i = 1; i <= ar.size() - k + 1; i++) {
            res = Math.max(res, pre[i + k - 1] - pre[i - 1]);
           
        }
        System.out.println(n - res);

    }
}
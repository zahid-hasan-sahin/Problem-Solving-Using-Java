import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

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
        TreeSet<Integer> t = new TreeSet<Integer>();
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            t.add(a[i]);
        }
        int k = 0;
        while (log2(k) * n <= p * 8 && k <= n) {
            if (log2(k) * n > p * 8) {
                --k;
                break;
            }
            ++k;
        }
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            h.put(a[i], h.getOrDefault(a[i], 0) + 1);
        }
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int i : t) {
            ar.add(h.get(i));
          
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
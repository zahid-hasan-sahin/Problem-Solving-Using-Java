import java.util.Scanner;
import java.util.HashMap;

public class A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String[] a = new String[n];
            HashMap<String, Integer> h = new HashMap<String, Integer>();
            for (int i = 0; i < n; i++) {
                String s = scan.next();
                a[i] = s;
                h.put(s, h.getOrDefault(s, 0) + 1);
            }
            int[] res = new int[n];
            k:
            for (int i = 0; i < n; i++) {
                String s = a[i];
                for (int j = 1; j < s.length(); j++) {
                    String x = s.substring(0, j);
                    String y = s.substring(j, s.length());
                    if (h.getOrDefault(x, 0) >= 1 && h.getOrDefault(y, 0) >= 1) {
                        res[i] = 1;
                        continue k;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(res[i]);
            }
            System.out.println();
        }
    }

}
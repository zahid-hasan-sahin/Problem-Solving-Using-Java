import java.util.ArrayList;
import java.util.Scanner;

public class Mostsociallydistancedsubsequence {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int mx = -1;
            int mn = 1999999999;
            int e = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                if (mx < a[i]) {
                    mx = a[i];
                    e = i;
                }
            }
            ArrayList<Integer> r = new ArrayList<Integer>();
            for (int i = 0; i < e; i++) {
                if (a[i] < mn) {
                    mn = a[i];
                }
            }
            if (mn != 1999999999) {
                r.add(mn);
            }
            r.add(mx);
            int m = mx;

            for (int i = e; i < n; i++) {
                if (m > a[i]) {
                    m = a[i];
                }
            }
            if (m != mx) {
                r.add(m);
            }
            System.out.println(r.size());
            for (int i = 0; i < r.size(); i++) {
                System.out.print(r.get(i)+" ");
            }
            System.out.println();

        }
        
    }
}
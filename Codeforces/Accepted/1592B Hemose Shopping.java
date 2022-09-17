import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class cfContest1592 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int x = scan.nextInt();
            ArrayList<Integer> ar = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                ar.add(a[i]);
            }
            Collections.sort(ar);
            for (int i = 0; i < n; i++) {
                if (i + x >= n && i - x < 0 && a[i] != ar.get(i)) {
                    System.out.println("NO");
                    continue k;
                }
            }
            System.out.println("YES");
        }
    }
}
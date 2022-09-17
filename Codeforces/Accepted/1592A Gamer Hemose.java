import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class cfContest1592 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int p = scan.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                a.add(scan.nextInt());
            }
            Collections.sort(a);
            int x = a.get(n - 1);
            int y = a.get(n - 2);
            int res = (int) Math.ceil((double) p / (x + y));
            int r = res * 2;
            if (res * (x + y) - y >= p) {
                --r;
            }
            System.out.println(r);
        }
    }
}
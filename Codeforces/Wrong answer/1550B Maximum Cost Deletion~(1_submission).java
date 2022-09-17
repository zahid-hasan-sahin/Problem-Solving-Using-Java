import java.util.ArrayList;
import java.util.Scanner;

public class cfcontest1550 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();
            String s = scan.next();

            ArrayList<Integer> ar = new ArrayList<Integer>();
            for (int i = 0; i < n;) {
                int ch = s.charAt(i);
                int k = 0;

                while (i < n) {
                    if (ch != s.charAt(i)) {
                        break;
                    }
                    ++k;
                    ++i;
                }
                ar.add(k);
            }
            int z = 0;
            int o = 0;
            for (int i = 0; i < ar.size(); i += 2) {
                z += ar.get(i);
            }
            for (int i = 1; i < ar.size(); i += 2) {
                o += ar.get(i);
            }
            long res = ((z * a) + b) + (o * a + b);
            long res2 = 0;
            for (int i = 0; i < n; i++) {
                res2 += (a) + b;
            }

            long r = Math.max(res, res2);

            System.out.println(r);
        }
    }

}
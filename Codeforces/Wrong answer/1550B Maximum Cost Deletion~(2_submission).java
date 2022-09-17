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

            //  System.out.println(ar);
            if (a >= 0 && b >= 0) {
                System.out.println((n * a) + b);
            } else if (b <= 0 && a <= 0) {
                long o = 0;
                long z = 0;
                for (int i = 0; i < ar.size(); i += 2) {
                    z += ar.get(i);
                }
                for (int i = 1; i < ar.size(); i += 2) {
                    o += ar.get(i);
                }
                long res = ((z * a) + b) + (o * a + b);
                System.out.println(res);
            } else if (a <= 0) {
                System.out.println((a + b) * n);
            } else {
                long o = 0;
                long z = 0;
                for (int i = 0; i < ar.size(); i += 2) {
                    z += ar.get(i);
                }
                for (int i = 1; i < ar.size(); i += 2) {
                    o += ar.get(i);
                }
                long res = ((z * a) + b) + (o * a + b);
                System.out.println(res);
            }
        }
    }

}
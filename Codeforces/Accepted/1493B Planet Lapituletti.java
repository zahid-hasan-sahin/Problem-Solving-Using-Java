import java.util.ArrayList;
import java.util.Scanner;

public class NewClass2 {

    public static String rev(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    static boolean check(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '5' || s.charAt(i) == '8') {
                ++c;
            }
        }
        return c == s.length();
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        StringBuilder sb = new StringBuilder();

        k:
        while (t-- > 0) {
            int h = scan.nextInt();
            int m = scan.nextInt();
            String s = scan.next();
            String[] ar = s.split(":", -1);
            int a = Integer.valueOf(ar[0]);
            int b = Integer.valueOf(ar[1]);
            for (int i = 0; i <= h * m + 10; i++) {
                String l = String.valueOf(a);
                String r = String.valueOf(b);
                for (int j = 0; j < 2; j++) {
                    if (l.length() < 2) {
                        l = "0" + l;
                    }
                    if (r.length() < 2) {
                        r = "0" + r;
                    }
                }
                String r1 = l;
                String r2 = r;
                l = rev(l);
                r = rev(r);

                for (int j = 0; j < 2; j++) {
                    if (l.charAt(j) == '2') {
                        l = l.substring(0, j) + "5" + l.substring(j + 1, 2);

                    } else if (l.charAt(j) == '5') {
                        l = l.substring(0, j) + "2" + l.substring(j + 1, 2);
                    }
                    if (r.charAt(j) == '2') {
                        r = r.substring(0, j) + "5" + r.substring(j + 1, 2);
                    } else if (r.charAt(j) == '5') {
                        r = r.substring(0, j) + "2" + r.substring(j + 1, 2);
                    }
                }

                boolean v = check(l);
                boolean g = check(r);

                if (v && g && Integer.valueOf(l) < m && Integer.valueOf(r) < h) {
                    sb.append(r1 + ":" + r2 + "\n");
                    continue k;
                }
                ++b;
                if (b == m) {
                    b = 0;
                    ++a;
                }
                if (a == h) {
                    a = 0;
                }

            }

        }
        System.out.println(sb);
    }
}
import java.util.Scanner;

public class CampSchedule {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();
        int n = s.length();
        int m = t.length();
        int mx = m;
        int l = 0;
        int r = m - 1;
        while (r > m / 2) {

            if (t.charAt(l) != t.charAt(r)) {
                break;
            }
            mx = r;
            ++l;
            --r;
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < mx; i++) {
            sb.append(t.charAt(i));
        }
        int o = 0;
        int z = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                ++o;
            } else {
                ++z;
            }
        }
        System.out.println();
        StringBuilder res = new StringBuilder();
        int i = 0;
        int p = sb.length();
        while (true) {
            if (sb.charAt(i % p) == '1') {
                if (o == 0) {
                    break;
                }
                res.append(1);
                --o;

            }

            if (sb.charAt(i % p) == '0') {
                if (z == 0) {
                    break;
                }
                res.append(0);
                --z;

            }
            ++i;
        }

        while (o != 0) {
            res.append("1");
            --o;
        }

        while (z != 0) {
            res.append("0");
            --z;
        }
        System.out.println(res);

    }

}
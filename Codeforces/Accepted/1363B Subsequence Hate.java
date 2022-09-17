import java.util.Scanner;

public class SubsequenceHate {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next();
            int n = s.length();
            char[] a = s.toCharArray();
            int one = 0;
            int zero = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == '0') {
                    ++zero;
                } else {
                    ++one;
                }
            }
            int c = 0;
            int k = 0;
            int res = 1000000000;
            for (int i = 0; i < n; i++) {
                if (a[i] == '1') {
                    ++c;
                } else {
                    ++k;
                }
                res = Math.min(res, one - c + k);

            }
            c = 0;
            k = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == '0') {
                    ++c;
                } else {
                    ++k;
                }
                res = Math.min(res, zero - c + k);
            }
            System.out.println(res);
        }
    }
}
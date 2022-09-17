import java.util.Scanner;

public class SubsequenceHate {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {

            String s = scan.next();
            int n = s.length();
            char[] a = s.toCharArray();
            int res = 1000000000;
            int c = 0;
            for (int i = 1; i < n; i++) {
                if (a[i] == '1') {
                    ++c;
                }
            }
            res = Math.min(res, c);
            c = 0;
            for (int i = 1; i < n; i++) {
                if (a[i] == '0') {
                    ++c;
                }
            }
            res = Math.min(res, c);
            c = 0;
            for (int i = n - 2; i >= 0; i--) {
                if (a[i] == '0') {
                    ++c;
                }
            }
            res = Math.min(res, c);
            c = 0;
            for (int i = n - 2; i >= 0; i--) {
                if (a[i] == '1') {
                    ++c;
                }
            }
            res = Math.min(res, c);
            System.out.println(res);
        }
    }
}
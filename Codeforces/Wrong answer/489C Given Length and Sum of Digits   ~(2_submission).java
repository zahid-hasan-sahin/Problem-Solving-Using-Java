import java.util.Scanner;

public class GivenLength {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        if (n * 9 < m || m == 0) {
            System.out.println("-1 -1");
        } else if (n > m) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < m; i++) {
                sb.append("1");
            }
            for (int i = 0; i < n - m; i++) {
                sb.append("0");
            }
            StringBuilder mn = new StringBuilder();
            mn.append("1");
            --n;
            --m;
            for (int i = 0; i < n - m; i++) {
                mn.append("0");
            }
            for (int i = 0; i < m; i++) {
                mn.append("1");
            }
            System.out.println(mn + " " + sb);
        } else {
            StringBuilder sb = new StringBuilder();
            if (m <= 9) {
                sb.append(m);
                m = 0;
            } else {
                sb.append("9");
                m -= 9;
            }
            --n;
            while (m != 0) {
                if (m >= 9) {
                    sb.append("9");
                    m -= 9;
                    --n;
                } else {
                    sb.append(m);
                    --n;
                    m = 0;
                    break;
                }
             
            }
            for (int i = 0; i < n; i++) {
                sb.append("0");
            }
            String max = sb.toString();
            String mx = sb.reverse().toString();
            int i = 0;
            while (mx.charAt(i) == '0') {
                ++i;
            }
            StringBuilder res = new StringBuilder();
            res.append(mx.charAt(i));
            for (int j = 0; j < i; j++) {
                res.append("0");
            }
            res.append(mx.substring(i + 1, mx.length()));
            System.out.println(res + " " + max);

        }
    }

}
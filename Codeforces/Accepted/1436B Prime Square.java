import java.util.Scanner;

public class NewClass11 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        int p = 100000;
        int[] a = new int[p + 1];
        for (int i = 2; i <= p; i++) {
            if (a[i] == 0) {
                for (long j = (long) i * i; j <= p; j += i) {
                    a[(int) j] = 1;
                }
            }
        }
        while (t-- > 0) {
            int n = scan.nextInt();
            StringBuilder sb = new StringBuilder();
            int r = n;
            if (n % 2 == 1) {
                --n;
            }
            int k = 0;
            for (int i = 0; i < n; i += 2) {
                for (int j = 0; j < k; j++) {
                    sb.append("0 ");
                }
                sb.append("1 1");
                for (int j = k + 2; j < n; j++) {
                    sb.append(" 0");
                }
                if (r % 2 == 1) {
                    sb.append(" 0");
                }
                sb.append("\n");
                for (int j = 0; j < k; j++) {
                    sb.append("0 ");
                }
                sb.append("1 1");
                for (int j = k + 2; j < n; j++) {
                    sb.append(" 0");
                }
                if (r % 2 == 1) {
                    sb.append(" 0");
                }
                sb.append("\n");
                k += 2;

            }
            if (r % 2 == 1) {
                sb = sb.delete(sb.length() - 2, sb.length());

                sb.append("1");
                sb.append("\n");
                for (int i = 0; i < r - 2; i++) {
                    sb.append("0 ");
                }
                sb.append("1 1");
                sb.append("\n");
            }
            sb = sb.delete(sb.length()-1, sb.length());
            System.out.println(sb);
            
        }
    }
}
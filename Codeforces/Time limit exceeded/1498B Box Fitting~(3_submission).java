import java.util.Arrays;
import java.util.Scanner;

public class NewClass7 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = scan.nextInt();
            int w = scan.nextInt();
            long[] a = new long[1048576];
            for (int i = 0; i < n; i++) {
                int in = scan.nextInt();
                ++a[in];

            }
            long sum = 0;
            long res = 0;

            while (true) {
                int q = 19;
                int r = 0;
                while (q-- >= 0) {
                    int p = (int) Math.pow(2, q);
                    while (a[p] > 0) {
                        ++r;
                        if (sum + p <= w) {
                            sum = sum + p;
                            --a[p];
                        } else {
                            break;
                        }
                    }

                }

                if (r == 0) {
                    break;
                }
                ++res;
                sum = 0;
            }
            sb.append(res + "\n");
            

        }

        System.out.println(sb);
    }

}
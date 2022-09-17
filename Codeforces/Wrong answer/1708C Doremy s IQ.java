import java.util.ArrayList;
import java.util.Scanner;

public class cfContest1708 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int q = scan.nextInt();
            int[] a = new int[n + 1];
            a[n] = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            ArrayList<Integer> ar = new ArrayList<Integer>();
            int[] fre = new int[n + 1];
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                if (a[i] <= q) {
                    ar.add(i);
                    ++fre[i];
                    res[i] = 1;
                }
            }

            int[] max = new int[n + 1];
            int mx = Integer.MIN_VALUE;
            int[] ind = new int[n + 1];
            int x = n;
            for (int i = n - 1; i >= 0; i--) {
                max[i] = mx;
                ind[i] = x;
                if (mx < a[i] && fre[i] == 1) {
                    x = i;
                    mx = a[i];
                }
            }

            for (int i = 0; i < n; i++) {
                if (a[i] > q) {
                    if (q - 1 >= max[i]) {
                        --q;
                        res[i] = 1;
                    }

                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(res[i]);
            }
            System.out.println();
        }
    }

}
import java.util.Scanner;

public class cfContest1712 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int[] f = new int[n + 1];
            for (int i = 0; i < k; i++) {
                ++f[a[i]];
            }
            int res = 0;
            for (int i = 1; i <= k; i++) {
                if (f[i] == 0) {
                    ++res;
                }
            }
            System.out.println(res);
        }

    }

}
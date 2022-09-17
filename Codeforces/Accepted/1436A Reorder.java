import java.util.Scanner;

public class NewClass11 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n + 1];
            int k = scan.nextInt();
            long res = 0;
            for (int i = 1; i <= n; i++) {
                res += scan.nextInt();
            }

            if (res == k) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }
}
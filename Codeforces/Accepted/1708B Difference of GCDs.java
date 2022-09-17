import java.util.Scanner;

public class cfContest1708 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int l = scan.nextInt();
            int r = scan.nextInt();
            long[] res = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                int k = l / i;
                if (k * i != l) {
                    ++k;
                }

                if (k * i > r) {
                    System.out.println("NO");
                    continue k;
                }
                res[i] = k * i;
            }
            System.out.println("YES");
            for (int i = 1; i <= n; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();

        }
    }

}
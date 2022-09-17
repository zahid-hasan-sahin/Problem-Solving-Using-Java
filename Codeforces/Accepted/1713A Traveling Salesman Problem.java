import java.util.Scanner;

public class cfContest1713 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int a = 0;
            int b = 0;
            long c = 0;
            int d = 0;
            for (int i = 0; i < n; i++) {
                int x = scan.nextInt();
                int y = scan.nextInt();
                if (y == 0) {
                    if (x >= 0) {
                        a = Math.max(a, x);
                    } else {
                        c = Math.min(c, x);
                    }
                } else {
                    if (y >= 0) {
                        b = Math.max(y, b);
                    } else {
                        d = Math.min(y, d);
                    }
                }
            }
            long res = a + b + Math.abs(c) + a + Math.abs(d) + b + Math.abs(c) + Math.abs(d);
            System.out.println(res);
        }
    }
}
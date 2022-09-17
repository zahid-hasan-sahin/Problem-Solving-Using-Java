import java.util.Scanner;

public class NewClass3 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            String s = scan.next();
            int l = 0;
            int r = n - 1;

            while (l < n && r >= 0 && s.charAt(l) == s.charAt(r)) {
                ++l;
                --r;

            }
            if (r > l && k != 0) {
                System.out.println("NO");
            } else if (r > l && k == 0) {
                System.out.println("YES");
            } else {
                int p = (int) Math.ceil(n / 2.0);
                if (p >= k && n % 2 == 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }

            }

        }

    }

}
import java.util.Scanner;

public class BinaryStringMinimizing {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            long k = scan.nextLong();
            StringBuilder s = new StringBuilder(scan.next());
            int e = 0;
            for (int i = 0; i < n && k > 0; i++) {
                if (s.charAt(i) == '0') {
                    char w = s.charAt(i);
                    int u = Math.max(Math.min(e, n - 1), (int) (Math.min(i - k, n - 1)));
                    s.setCharAt(i, s.charAt(Math.min(u,n-1)));
                    s.setCharAt(u, w);
                    k -= (i - e);
                    ++e;
                }

            }
            System.out.println(s);
        }
    }

}
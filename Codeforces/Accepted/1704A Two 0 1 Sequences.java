import java.util.Scanner;

public class cfContest1704 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            String p = scan.next();
            String q = scan.next();
            for (int i = 1; i < m; i++) {

                if (q.charAt(m - i) != p.charAt(n - i)) {
                    System.out.println("NO");
                    continue k;
                }
            }
            for (int i = 0; i <= n - m; i++) {
                if (q.charAt(0) == p.charAt(i)) {
                    System.out.println("YES");
                    continue k;
                }
            }
            System.out.println("NO");
        }
    }
}
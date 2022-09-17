import java.util.Scanner;

public class cfContest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();
            int k = scan.nextInt();

            if ((y + k >= m && y <= k + 1) || (k + x >= n && x <= k + 1) || (k + 1 >= x && k + 1 >= y)
                    || (n - x <= k && m - y <= k)) {
                System.out.println("-1");
            } else {
                System.out.println(n + m - 2);
            }
        }
    }
}
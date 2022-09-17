import java.util.Scanner;

public class cfContest1715 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();

            if (n < m) {
                int k = n;
                n = m;
                m = k;
            }
            int k = (m - 1) + (m - 1) + (n - 1) + 1;
            if (n == 1 && m == 1) {
                System.out.println("0");
            } else {
                System.out.println(k);
            }
        }
    }

}
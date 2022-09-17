import java.util.Scanner;

public class NewClass12 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int p = m + 1;
            int t = n % p;
           
            if (t < p / 2.0 || t + (m - n) >= p) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

    }

}
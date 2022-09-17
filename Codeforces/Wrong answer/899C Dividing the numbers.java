import java.util.Scanner;

public class Dividingthenumbers {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long t = n * (long) (n + 1);
        t /= 2;
        System.out.println(t % 2);

        t /= 2;
        n = Math.min(n, (int) t);
        int p = 0;

        while (n > 0) {
            System.out.print(n + " ");
            p += n;
            if (t - p <= 0) {
                break;
            }
            if (t - p < n) {
                System.out.print(t - p);
                break;
            }
            --n;
        }
        System.out.println();

    }
}
import java.util.Scanner;

public class NewClass6 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            if (n % 2 == 0) {
                System.out.println(n / 2 + " " + n / 2);
            } else {
                int p = 0;
                int r = n;
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        p = i;
                        while (n % i == 0) {
                            n /= i;
                        }
                    }
                }
                if (n >= 2) {
                    p = n;
                }
                if (p == r) {
                    System.out.println(p - 1 + " " + 1);
                } else {
                    System.out.println(r - p + " " + p);
                }
            }

        }

    }

}
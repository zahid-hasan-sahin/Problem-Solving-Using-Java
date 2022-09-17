import java.util.Scanner;

public class B {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long n = scan.nextInt();
            long k = scan.nextInt();

            System.out.println(k / (long) (n - (Math.ceil(n / 2.0)) + 1));
        }
    }
}
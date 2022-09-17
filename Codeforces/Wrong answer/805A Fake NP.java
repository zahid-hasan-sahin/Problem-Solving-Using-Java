import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        if (m - n == 1 || n - m == 1) {
            System.out.println(n % 2 == 0 ? n / 2 : m / 2);
        } else if (m == n) {
            System.out.println(m);
        } else {
            System.out.println(2);
        }
    }
}
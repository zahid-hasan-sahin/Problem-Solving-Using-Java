import java.util.ArrayList;
import java.util.Scanner;

public class cfContest1594 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        long n = scan.nextInt();
        long mod = 1000000007;
        long res = 6;
        long p = (long) Math.pow(2, n);

        for (int i = 0; i < p - 2; i++) {

            res = ((res % mod) * 4) % mod;
        }
        System.out.println(res);

    }
}
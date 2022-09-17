import java.util.Scanner;

public class A {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        long r = 256;
        int res = Math.min(a, Math.min(c, d));
        r *= res;
        int k = a - res;
        res = Math.min(k, b);
        r += (32 * res);
        System.out.println(r);
    }
}
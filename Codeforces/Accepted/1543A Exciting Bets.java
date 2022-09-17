import java.util.Scanner;

public class cfContest1543 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            long a = scan.nextLong();
            long b = scan.nextLong();
            long r = Math.abs(a - b);
            if (r == 0) {
                System.out.println("0 0");
                continue k;
            }
            long o = Long.MAX_VALUE;

            o = r * ((a / r) + 1) - a;
            o = Math.min(o, a - (r * ((a / r))));

            System.out.println(r + " " + o);
        }
    }
}
import java.util.Scanner;

public class cfContest1546 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int e = scan.nextInt();
            int f = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();

            long res = Math.abs(a - e) + Math.abs(b - f);
            
            if ((a == c && a == e) && ((b <= d && d <= f) || (d >= f && b >= d))) {
                res += 2;
            } else if ((d == b && d == f) && ((a <= c && e >= c) || (a >= c && e <= c))) {

                res += 2;
            }
            System.out.println(res);

        }
    }
}
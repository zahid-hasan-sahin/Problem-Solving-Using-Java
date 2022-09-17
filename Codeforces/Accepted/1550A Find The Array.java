import java.util.Scanner;

public class cfcontest1550 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            long s = 0;
            int p = 1;
            int c = 0;
            while (s < n) {
                s += p;
                p += 2;
                ++c;
            }
            System.out.println(c);
        }
    }

}
import java.util.Scanner;

public class Domino {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int k = scan.nextInt();
            int a = n;
            int b = m / 2 * 2;
            
            if (k <= (a * b / 2) && Math.abs(k - (a * b / 2)) % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
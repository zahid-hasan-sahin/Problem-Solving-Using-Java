import java.util.Scanner;

public class NewClass12 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            if (n >= 3) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

}
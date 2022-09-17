import java.util.Scanner;

public class NewClass8 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();

            if (6 + 10 + 14 + 1 <= n) {
                System.out.println("YES");
                if (n == 36) {
                    System.out.println(15 + " " + 10 + " " + 6 + " " + (n - (15 + 10 + 6)));
                } else if (n == 40) {
                    System.out.println(6 + " " + 15 + " " + 14 + " " + (n - (6 + 15 + 14)));
                } else if (n == 44) {
                    System.out.println(6 + " " + 10 + " " + 15 + " " + (n - (6 + 10 + 15)));
                } else {
                    System.out.println(6 + " " + 10 + " " + 14 + " " + (n - (6 + 10 + 14)));
                }
            } else {
                System.out.println("NO");
            }

        }
    }

}
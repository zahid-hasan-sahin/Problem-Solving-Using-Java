import java.util.Arrays;
import java.util.Scanner;

public class NewClass4 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            if (n % 2 == 1) {
                int r = n - 1;
                sb.append(1 + " " + (r / 2) + " " + (r / 2) + "\n");
            } else {
                if (n % 3 == 0) {
                    sb.append(n / 3 + " " + (n / 3) + " " + (n / 3) + "\n");
                } else if (n % 4 == 0) {
                    int p = n / 2;
                    sb.append(p + " " + (p / 2) + " " + (p / 2) + "\n");
                } else {
                    int p = (n - 2);
                    sb.append(2 + " " + (p / 2) + " " + (p / 2) + "\n");
                }
            }

        }
        System.out.println(sb);

    }
}
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
            int p = n - (k - 2);
            if (p % 2 == 0) {
                for (int i = 0; i < k - 2; i++) {
                    sb.append(1 + " ");
                }
                sb.append(p / 2 + " " + p / 2+"\n");
            } else {
                for (int i = 0; i < k - 3; i++) {
                sb.append(1 + " ");
                }
                sb.append(2 + " ");
              sb.append(p / 2 + " " + p / 2+"\n");
            }
        }
        System.out.println(sb);

    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class NewClass5 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            String s = scan.next();
            int l = -1;
            int k = -1;
            int n = s.length();
            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) == '0' && s.charAt(i + 1) == '0') {
                    l = i;
                }

            }
            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) == '1' && s.charAt(i + 1) == '1') {
                    k = i;
                    break;
                }
            }
            if (k == -1 || l == -1) {
                System.out.println("YES");
                continue;
            }

            for (int i = 0; i < l - 1; i++) {
                if (s.charAt(i) == '1' && s.charAt(i + 1) == '1') {

                    System.out.println("NO");
                    continue k;
                }
            }
            for (int i = k; i < n - 1; i++) {
                if (s.charAt(i) == '0' && s.charAt(i + 1) == '0') {
                    System.out.println("NO");
                    continue k;
                }
            }
            System.out.println("YES");

        }
    }

}
import java.util.Arrays;
import java.util.Scanner;

public class CharacterSwap {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        h:
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            String k = scan.next();
            int c = 0;
            int r = 0;
            char[] a = new char[4];
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != k.charAt(i)) {
                    if (r >= 4) {
                        System.out.println("No");
                        continue h;
                    }
                    a[r++] = s.charAt(i);
                    a[r++] = k.charAt(i);
                }
            }
            Arrays.sort(a);
            if (a[0] == a[1] && a[2] == a[3]) {
                System.out.println("Yes");
            } else {
                System.out.println("NO");
            }

        }
    }

}
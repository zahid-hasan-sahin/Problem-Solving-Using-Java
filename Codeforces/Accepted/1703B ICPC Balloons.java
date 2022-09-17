import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            int[] fre = new int[27];
            for (int i = 0; i < n; i++) {
                ++fre[s.charAt(i) - 'A'];
            }
            int res = 0;
            for (int i = 0; i < 26; i++) {
                if (fre[i] >= 1) {
                    res += fre[i] + 1;
                }
            }
            System.out.println(res);
        }
    }

}
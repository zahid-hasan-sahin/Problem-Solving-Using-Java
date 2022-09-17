import java.util.Arrays;
import java.util.Scanner;

public class SubsequencePermutation {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            char[] a = s.toCharArray();
            Arrays.sort(a);
            int res = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] != s.charAt(i)) {
                    ++res;
                }
            }
            System.out.println(res);
        }
    }
}
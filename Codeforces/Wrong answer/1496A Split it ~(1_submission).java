import java.util.Scanner;

public class NewClass3 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            String s = scan.next();
            int l = 0;
            int r = n - 1;
            int e = 0;
            while (l < n && r >= 0 && s.charAt(l) == s.charAt(r) && l < r) {
                ++l;
                --r;
                e++;
            }

            if (k == 0) {
                System.out.println("YES");
            } else if (((l + 1 == r || l == r)) && (e >= k)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

}
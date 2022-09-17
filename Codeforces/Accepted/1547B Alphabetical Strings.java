import java.util.Scanner;

public class cfContest1546 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            String s = scan.next();
            int l = 0;
            int r = s.length() - 1;
            int o = 1;
            int n = s.length();
            boolean b = true;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'a') {
                    l = i - 1;
                    r = i + 1;
                    b = false;
                    break;
                }
            }
            if (b) {
                System.out.println("NO");
                continue k;
            }
            while (l >= 0 || r < n) {
                char k = (char) ('a' + o);
                ++o;

                if (l >= 0 && s.charAt(l) == k) {
                    --l;

                } else if (r < n && s.charAt(r) == k) {

                    ++r;
                } else {

                    System.out.println("NO");
                    continue k;
                }
            }
            System.out.println("YES");
        }
    }
}
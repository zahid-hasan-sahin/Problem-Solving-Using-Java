import java.util.Scanner;

public class cfContest1573 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            long res = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != '0') {
                    if (i == n - 1) {
                        res += s.charAt(i) - '0';
                    } else {
                        res += s.charAt(i) - '0' + 1;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
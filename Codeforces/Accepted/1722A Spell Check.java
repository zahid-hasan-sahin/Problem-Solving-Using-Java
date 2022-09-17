import java.util.Scanner;

public class cfContest1722 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] f = new int[200];
            String s = scan.next();
            for (int i = 0; i < n; i++) {
                ++f[s.charAt(i) - 'A'];
            }
            //Timur
            if (f['T' - 'A'] >= 1 && f['i' - 'A'] >= 1 && f['m' - 'A'] >= 1 && f['u' - 'A'] >= 1 && f['r' - 'A'] >= 1 && n==5) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
import java.util.Scanner;

public class cfContest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            char[][] a = new char[2][2];
            for (int i = 0; i < 2; i++) {
                String s = scan.next();
                for (int j = 0; j < 2; j++) {
                    a[i][j] = s.charAt(j);
                }
            }
            int[] f = new int[27];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    ++f[a[i][j] - 'a'];
                }
            }
            int k = 0;
            int m = 100;
            for (int i = 0; i < 26; i++) {
                if (f[i] != 0) {
                    k = Math.max(k, f[i]);
                    m = Math.min(m, f[i]);
                }
            }

            if (m == 2) {
                System.out.println(1);
            } else if (m == 1 && k == 2) {
                System.out.println(2);
            } else if (m == 1 && k == 1) {
                System.out.println(3);
            } else if (m == 1 && k == 3) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
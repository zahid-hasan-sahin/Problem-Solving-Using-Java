import java.util.Scanner;

public class cfContest1722 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            char[][] a = new char[2][n];
            for (int i = 0; i < 2; i++) {
                String s = scan.next();
                for (int j = 0; j < n; j++) {
                    a[i][j] = s.charAt(j);
                    if (a[i][j] == 'G' || a[i][j] == 'B') {
                        a[i][j] = '1';
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                if (a[0][i] != a[1][i]) {
                    System.out.println("NO");
                    continue k;
                }
            }
            System.out.println("YES");

        }
    }
}
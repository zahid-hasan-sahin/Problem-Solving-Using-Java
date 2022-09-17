import java.util.ArrayList;
import java.util.Scanner;

public class B {

    public static void main(String args[]) {
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
                }
            }
            int res = 0;
            int isOne = 0;
            int isZero = 0;
            int c = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 2; j++) {
                    if (a[j][i] == '1') {
                        isOne = 1;
                    } else {
                        isZero = 1;
                    }
                }
                if (isOne == 1 && isZero == 1) {
                    res += 2;
                    isOne = 0;
                    isZero = 0;
                    c = 0;
                } else if (isZero == 1) {
                    ++c;
                }
                if (c >= 2) {
                    c = 0;
                    res += 2;
                }

            }
            if (c != 0) {
                ++res;
            }
            System.out.println(res);

        }
    }
}
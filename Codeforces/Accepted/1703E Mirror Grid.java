import java.util.Scanner;
import java.util.HashMap;

public class A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                String s = scan.next();
                for (int j = 0; j < n; j++) {
                    a[i][j] = s.charAt(j) - '0';
                }
            }

            int res = 0;
            for (int r = 0; r < n; r++) {
                for (int c = 0; c < n; c++) {
                    int o = 0;
                    int z = 0;
                    if (a[r][c] == 1) {
                        ++o;
                    } else {
                        ++z;
                    }

                    if (a[c][n - r - 1] == 1) {
                        ++o;
                    } else {
                        ++z;
                    }

                    if (a[n - r - 1][n - c - 1] == 1) {
                        ++o;
                    } else {
                        ++z;
                    }

                    if (a[n - c - 1][r] == 1) {
                        ++o;
                    } else {
                        ++z;
                    }

                    if (o != 0 && z != 0) {
                        if (o > z) {
                            res += z;
                            a[r][c] = 0;
                            a[c][n - r - 1] = 0;
                            a[n - r - 1][n - c - 1] = 0;
                            a[n - c - 1][r] = 0;
                        } else {
                            res += o;
                            a[r][c] = 1;
                            a[c][n - r - 1] = 1;
                            a[n - r - 1][n - c - 1] = 1;
                            a[n - c - 1][r] = 1;
                        }
                    }

                }
            }
            System.out.println(res);
        }
    }

}
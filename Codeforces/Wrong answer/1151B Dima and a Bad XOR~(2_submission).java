import java.util.HashSet;
import java.util.Scanner;

public class DimaandaBadXOR {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] a = new int[n][m];
        int[] f = new int[1024];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            HashSet<Integer> ar = new HashSet<Integer>();
            for (int j = 0; j < m; j++) {
                ar.add(a[i][j]);
            }
            for (int j : ar) {
                ++f[j];
            }
        }

        for (int i = 1; i < 1024; i++) {
            if (f[i] % 2 == 1) {
                System.out.println("TAK");
                k:
                for (int j = 0; j < n; j++) {

                    for (int k = 0; k < m; k++) {
                        if (a[j][k] == i) {
                            System.out.print((k + 1) + " ");
                            continue k;
                        }
                    }
                    System.out.print(1 + " ");
                }

                return;
            }
        }
        int[][] fre = new int[n][1024];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ++fre[i][a[i][j]];
            }
        }
        for (int i = 1; i < 1024; i++) {
            if (f[i] != 0) {
                for (int j = 0; j < n; j++) {
                    System.out.println("TAK");
                    if (fre[j][i] != 0 && fre[j][i] != m) {
                        for (int k = 0; k < n; k++) {
                            for (int l = 0; l < m; l++) {
                                if (k == j) {
                                    if (a[k][l] != i) {
                                        System.out.print(l + 1 + " ");
                                        break;
                                    }
                                } else if (fre[k][i] != 0) {
                                    if (a[k][l] == i) {
                                        System.out.print(l + 1 + " ");
                                        break;
                                    }
                                } else {
                                    System.out.print(1 + " ");
                                    break;
                                }
                            }
                        }
                        return;
                    }
                }
            }
        }
        System.out.println("NIE");

    }

}
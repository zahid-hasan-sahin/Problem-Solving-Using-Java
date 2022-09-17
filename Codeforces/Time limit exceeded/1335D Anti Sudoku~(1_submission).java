import java.util.Scanner;

public class AntiSudoku {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int[][] a = new int[9][9];
            for (int i = 0; i < 9; i++) {
                String s = scan.next();
                for (int j = 0; j < 9; j++) {
                    a[i][j] = s.charAt(j) - '0';
                }
            }
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (a[i][j] == 7) {
                        System.out.print(9);
                    } else {
                        System.out.print(a[i][j]);
                    }
                }
                System.out.println();
            }
        }
    }

}
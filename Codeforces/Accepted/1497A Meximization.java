import java.util.Arrays;
import java.util.Scanner;

public class NewClass4 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[110];
            for (int i = 0; i < n; i++) {
                ++a[scan.nextInt()];
            }
            for (int i = 0; i < 110; i++) {
                for (int j = 0; j < 110; j++) {
                    if (a[j] != 0) {
                        System.out.print(j + " ");
                        --a[j];
                    }
                }
            }

            System.out.println();
        }

    }
}
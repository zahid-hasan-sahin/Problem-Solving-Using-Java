import java.util.ArrayList;
import java.util.Scanner;

public class cfContest1000 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            if (n >= 6) {

                int[] a = new int[n];
                a[n - 1] = n;
                a[n - 2] = n - 1;
                a[n - 3] = 4;
                a[n - 4] = 3;
                a[n - 5] = 1;
                a[n - 6] = 2;
                int k = 5;

                for (int i = 0; i < n - 6; i++) {
                    a[i] = k++;
                }

                for (int i = 0; i < n; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            } else if (n == 5) {
                System.out.println("1 2 3 4 5");
            } else if (n == 4) {
                System.out.println("2 1 3 4");
            }
        }

    }
}
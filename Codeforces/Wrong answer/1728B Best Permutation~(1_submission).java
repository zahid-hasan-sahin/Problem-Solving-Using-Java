import java.util.ArrayList;
import java.util.Scanner;

public class cfContest1000 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            a[n - 1] = n;
            a[n - 2] = n - 1;
            if (n % 2 == 0) {
                a[0] = 2;
                a[1] = 1;
                for (int i = 2; i < n - 2; i++) {
                    a[i] = i + 1;
                }
            } else {
                for (int i = 0; i < n - 2; i++) {
                    a[i] = i + 1;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }

    }
}
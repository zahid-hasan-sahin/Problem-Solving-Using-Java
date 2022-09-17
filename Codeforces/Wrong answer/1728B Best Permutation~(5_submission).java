import java.util.ArrayList;
import java.util.Scanner;

public class cfContest1000 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            a[3] = n;
            a[2] = n - 1;
            a[1] = 1;
            a[0] = 2;
            int k = 3;

            for (int i = 4; i < n ; i++) {
                a[i] = k++;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }

    }
}
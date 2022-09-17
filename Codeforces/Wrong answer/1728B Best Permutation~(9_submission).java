import java.util.ArrayList;
import java.util.Scanner;

public class cfContest1000 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int sum = 0;
           
            a[n-1] = n;
            
            int p = n - 1;
            a[n - 2] = p - 1;
            a[n - 3] = 1;
            int k = 2;
            for (int i = 0; i < n - 4; i++) {
                a[i] = k++;
            }
            a[n - 4] = p;
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }

    }
}
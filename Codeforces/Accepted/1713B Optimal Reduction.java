import java.util.Scanner;

public class cfContest1713 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int ind = 0;
            int mx = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
             
                if (a[i] > mx) {
                    mx = a[i];
                    ind = i;
                }
            }

            for (int i = 0; i < ind - 1; i++) {
                if (a[i] > a[i + 1]) {
                    System.out.println("NO");
                    continue k;
                }
            }
            for (int i = ind; i < n-1; i++) {
       
                if (a[i] < a[i + 1]) {
                    System.out.println("NO");
                    continue k;
                }
            }
            System.out.println("YES");
        }
    }
}
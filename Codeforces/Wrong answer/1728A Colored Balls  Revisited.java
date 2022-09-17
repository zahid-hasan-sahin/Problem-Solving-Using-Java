import java.util.Scanner;

public class cfContest1000 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int mx = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int res = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 == 1 && a[i] >= mx) {
                    mx = a[i];
                    res = i;
                }
            }
            System.out.println(res + 1);

        }

    }
}
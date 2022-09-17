import java.util.Scanner;

public class cfContest1714 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int[] fre = new int[n + 1];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int res = 0;
            for (int i = n - 1; i >= 0; i--) {
                ++fre[a[i]];
                if (fre[a[i]] == 2) {
                    res = i + 1;
                    break;
                }
            }
            System.out.println(res);
        }
    }
}
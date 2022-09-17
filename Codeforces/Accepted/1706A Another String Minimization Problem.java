import java.util.Scanner;

public class cfContest1706 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            char[] res = new char[m + 1];
            for (int i = 1; i <= m; i++) {
                res[i] = 'B';
            }
            for (int i = 0; i < n; i++) {

                if (a[i] < m + 1 - a[i]) {
                    if (res[a[i]] == 'A') {
                        res[m + 1 - a[i]] = 'A';
                    } else {
                        res[a[i]] = 'A';
                    }
                   
                } else {
                    if (res[m + 1 - a[i]] == 'A') {
                        res[a[i]] = 'A';
                    } else {
                        res[m + 1 - a[i]] = 'A';
                    }
                }
            }
            for (int i = 1; i <= m; i++) {
                System.out.print(res[i]);
            }
            System.out.println();
        }
    }
}
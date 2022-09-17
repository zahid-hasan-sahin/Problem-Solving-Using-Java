import java.util.Scanner;

public class cfContest1716 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int c = 1;
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = i;
            }
            System.out.println(n);
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(a[j] + " ");
                }
                if (n != i) {
                    int temp = a[c + 1];
                    a[c + 1] = a[c];
                    a[c] = temp;
                    ++c;
                }
                System.out.println();
            }
        }

    }
}
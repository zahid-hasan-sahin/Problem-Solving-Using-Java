import java.util.Scanner;

public class cfContest1708 {

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
            for (int i = 1; i < n; i++) {
                if (a[i] % a[0] != 0) {
                    System.out.println("NO");
                    continue k;
                }
            }
            System.out.println("YES");

        }
    }

}
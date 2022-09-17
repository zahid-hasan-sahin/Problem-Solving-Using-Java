import java.util.Arrays;
import java.util.Scanner;

public class VladikandComplicatedBook {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            a[i] = in;
            b[i] = in;
        }
        while (m-- > 0) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            int x = scan.nextInt();
            Arrays.sort(b, l - 1, r);
            if (a[x - 1] == b[x - 1]) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            for (int i = l - 1; i < r; i++) {
                b[i] = a[i];
            }

        }

    }

}
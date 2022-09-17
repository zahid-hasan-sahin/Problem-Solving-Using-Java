import java.util.Arrays;
import java.util.Scanner;

public class FoxandBoxAccumulation {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[110];
        for (int i = 0; i < n; i++) {
            ++a[scan.nextInt()];
        }
        int res = 0;
        for (int i = 0; i < 110; i++) {
            int k = 0;
            for (int j = 0; j < 100; j++) {
                if (a[j] > 0) {
                    --a[j];
                    int p = 1;
                    if (k < j) {
                        p = j - k;
                        a[j] -= p;
                    }
                    k += p;
                }
            }
            if (k != 0) {
                ++res;
            }
        }
        System.out.println(res);

    }

}
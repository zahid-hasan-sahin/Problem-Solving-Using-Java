import java.util.ArrayList;
import java.util.Scanner;

public class SecretSanta {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int[] faka = new int[n + 1];
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                if (faka[a[i]] == 0) {
                    res[i] = a[i];
                    faka[a[i]] = 1;
                }
            }
            ArrayList<Integer> ar = new ArrayList<Integer>();
            for (int i = 1; i <= n; i++) {
                if (faka[i] == 0) {
                    ar.add(i);
                }
            }
            int q = 0;
            for (int i = 0; i < n; i++) {
                if (res[i] == 0) {
                    res[i] = ar.get(q++);
                }
            }
            int k = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == res[i]) {
                    ++k;
                }
            }
            System.out.println(k);
            for (int i = 0; i < n; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }

    }

}
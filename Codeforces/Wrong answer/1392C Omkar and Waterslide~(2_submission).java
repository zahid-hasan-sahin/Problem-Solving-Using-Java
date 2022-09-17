import java.util.Scanner;

public class NewClass1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            long res = 0;
            int mx = a[0];
            for (int i = 0; i < n - 1; i++) {
                mx = Math.max(mx, a[i]);
                if (a[i + 1] < a[i]) {

                    int k = a[i];
                    while (i < n - 1 && a[i + 1] < a[i]) {
                        ++i;
                        k = Math.min(k, a[i]);
                    }
                    
                  
                    res += (mx - k);
                }

            }
            System.out.println(res);
        }

    }

}
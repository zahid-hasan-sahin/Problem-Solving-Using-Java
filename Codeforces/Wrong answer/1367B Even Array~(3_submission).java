import java.util.Scanner;

public class NewClass3 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int o = 0;
            int e = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                if (a[i] % 2 == 1) {
                    ++o;
                } else {
                    ++e;
                }
            }
            if (e >= o) {
                int r = 0;
                for (int i = 0; i < n; i++) {
                    if (i % 2 != a[i] % 2) {
                        ++r;
                    }
                }
                System.out.println(r / 2);
            } else {
                System.out.println("-1");
            }
        }

    }

}
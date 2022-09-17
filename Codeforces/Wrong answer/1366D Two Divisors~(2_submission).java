import java.util.Scanner;

public class TwoDivisors {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        StringBuilder x = new StringBuilder();
        StringBuilder y = new StringBuilder();
        int q = scan.nextInt();
        int pr[] = new int[10000010];
        for (int i = 2; i < 10000010; i++) {
            if (pr[i] == 0) {
                for (int j = i; j < 10000010; j += i) {
                    if (pr[j] == 0) {
                        pr[j] = i;
                    }
                }
            }
        }
        while (q-- > 0) {
            int n = scan.nextInt();
            int a = pr[n];
            int i = n;
            int b = -1;
            while (true) {
                i /= a;
                if (pr[i] != a) {
                    b = pr[i];
                    break;
                }
            }
            if (b == 0) {
                a = -1;
                b = -1;
            }
            x.append(a + " ");
            y.append(b + " ");
        }
        System.out.println(x);
        System.out.println(y);

    }

}
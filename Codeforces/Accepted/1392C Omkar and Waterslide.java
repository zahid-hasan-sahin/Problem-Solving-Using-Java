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
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    res += (a[i] - a[i + 1]);;
                }
            }
            System.out.println(res);
        }

    }

}
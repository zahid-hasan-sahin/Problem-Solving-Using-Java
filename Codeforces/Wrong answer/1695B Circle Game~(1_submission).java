import java.util.Scanner;

public class cfConteest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            boolean ch = false;
            long sum1 = 0;
            long sum2 = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                if (i % 2 == 0) {
                    sum1 += a[i];
                }
                if (i % 2 == 1) {
                    sum2 += a[i];
                }
            }
            if (n % 2 == 0 && sum2 >= sum1) {

                System.out.println("Joe");

            } else {
                System.out.println("Mike");
            }

        }
    }
}
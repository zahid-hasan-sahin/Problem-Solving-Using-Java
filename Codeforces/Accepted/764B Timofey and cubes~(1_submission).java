import java.util.Scanner;

public class Timofeyandcubes {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < n / 2; i++) {
            if (i % 2 == 0) {
                int t = a[i];
                a[i] = a[n - i - 1];
                a[n - i - 1] = t;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }

}
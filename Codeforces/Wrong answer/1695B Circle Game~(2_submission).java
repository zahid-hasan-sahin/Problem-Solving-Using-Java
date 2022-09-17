import java.util.Scanner;

public class cfConteest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            boolean ch = false;
            int c = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                if (i % 2 == 1 && a[i] == 1) {
                    ch = true;
                }
                if (i % 2 == 0 && a[i] == 1) {
                    ++c;
                }
            }
            if (n == 1) {
                System.out.println("Mike");
            } else if (n >= 2) {
                if (ch && c != n / 2) {
                    System.out.println("Mike");
                } else {
                    if (n % 2 == 0) {
                        System.out.println("Joe");
                    } else {
                        System.out.println("Mike");
                    }
                }
            }

        }
    }
}
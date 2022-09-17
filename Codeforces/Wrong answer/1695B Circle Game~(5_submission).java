import java.util.Scanner;

public class cfConteest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            if (n == 1) {
                System.out.println("Mike");
            } else if (n >= 2) {
                if (a[0] == 1) {
                    System.out.println("Mike");
                } else if (a[1] == 1) {
                    System.out.println("Joe");
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
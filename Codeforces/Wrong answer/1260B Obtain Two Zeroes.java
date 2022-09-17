import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        while (total-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a > b) {
                if ((a%2 == 0 && b%2 == 1) || (a%2 == 1 && b%2 == 0)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                if ((a%2 == 0 && b%2 == 1) || (a%2 == 1 && b%2 == 0)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }

        }

    }

}
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        while (total-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a > b) {
                int ta = 0;
                int tb = 0;
                while (a > 0 && b > 0) {
                    ta = a;
                    tb = b;
                    a = a - 2;
                    b = b - 1;
                }
                if ((ta == 2 && tb == 1) || (ta == 1 && tb == 2)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                int ta = 0;
                int tb = 0;
                while (a > 0 && b > 0) {
                    ta = a;
                    tb = b;
                    a = a - 1;
                    b = b - 2;
                }
                if ((ta == 2 && tb == 1) || (ta == 1 && tb == 2)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }

        }

    }

}
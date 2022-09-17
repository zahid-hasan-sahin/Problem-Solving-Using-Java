import java.util.Scanner;

public class TheatreSquarev {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int a = scan.nextInt();
        int x = 0;
        int y = 0;
        if (n % a == 0) {
            x = n / a;
        } else {
            x = (n / a) + 1;
        }
        if (m % a == 0) {
            y = m / a;
        } else {
            y = (m / a) + 1;
        }

        System.out.println(x * y);

    }

}
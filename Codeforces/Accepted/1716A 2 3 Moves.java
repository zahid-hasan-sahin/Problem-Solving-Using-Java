import java.util.Scanner;

public class cfContest1716 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            if (n == 1) {
                System.out.println("2");
            } else {
                System.out.println((int) Math.ceil(n / 3.0));
            }
        }

    }
}
import java.util.Scanner;

public class cfContest1717 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long n = scan.nextInt();
            long res = ((n / 3 * 3) + (((n / 2) - (n / 3)) * 2) + (n - n / 2) + (n / 3 * 2) + (((n / 2) - (n / 3))));
            System.out.println(res);
        }
    }
}
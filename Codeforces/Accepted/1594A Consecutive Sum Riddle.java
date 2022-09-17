import java.util.Scanner;

public class cfContest1594 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long n = scan.nextLong();
            System.out.println(-(n - 1) + " " + n);

        }
    }
}
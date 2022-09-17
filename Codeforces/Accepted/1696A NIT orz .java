import java.util.Scanner;

public class cfContest1696 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int x = scan.nextInt();
            long res = 0;
            for (int i = 0; i < n; i++) {
                int in = scan.nextInt();
                res = Math.max(res,in | x);
            }
            System.out.println(res);
        }
    }
}
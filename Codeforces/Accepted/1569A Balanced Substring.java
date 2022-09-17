import java.util.Scanner;

public class cfContest1569 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            for (int i = 0; i < n - 1; i++) {
                if ((s.charAt(i) == 'a' && s.charAt(i + 1) == 'b') || (s.charAt(i) == 'b' && s.charAt(i + 1) == 'a')) {
                    System.out.println(i + 1 + " " + (i + 2));
                    continue k;
                }
            }
            System.out.println("-1 -1");

        }
    }
}
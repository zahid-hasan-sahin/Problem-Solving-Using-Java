import java.util.Scanner;

public class cfContest1551 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int a = n / 3;
            int c1 = n - a;
         
            if (c1 % 2 == 0) {
                System.out.println(a + " " + c1 / 2);
            } else {
                System.out.println(a + 1 + " " + (c1 / 2));
            }
        }
    }
}
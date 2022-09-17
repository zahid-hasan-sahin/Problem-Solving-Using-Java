import java.util.*;

public class A {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a * 2 <= b) {
                System.out.println(a + " " + (a * 2));
            } else {
                System.out.println("-1 -1");
            }
        }
    }
}
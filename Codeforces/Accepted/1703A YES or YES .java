import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next().toLowerCase();
            if (s.equals("yes")) {
                System.out.println("YES");
            } else {
                System.out.println("No");
            }
        }
    }

}
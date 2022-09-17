import java.util.Scanner;
import java.util.Stack;

public class BadSequence {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        int l = 0;
        int r = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                ++l;
            } else {
                ++r;
            }
            if (r - l >= 2) {
                System.out.println("No");
                return;
            }
        }

        if (l - r >= 2 || n % 2 == 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

}
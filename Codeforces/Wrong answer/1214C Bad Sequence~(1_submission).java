import java.util.Scanner;
import java.util.Stack;

public class BadSequence {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        Stack<Character> r = new Stack<Character>();
        Stack<Character> l = new Stack<Character>();
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                l.add(s.charAt(i));
            } else {
                r.add(s.charAt(i));
            }
            if (r.size() > l.size()) {
                ++c;
            }
            if (c > 1) {
                System.out.println("No");
                return;
            }
        }
        if (r.size() == l.size()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
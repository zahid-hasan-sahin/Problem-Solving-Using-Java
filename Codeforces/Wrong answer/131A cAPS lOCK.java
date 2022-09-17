import java.util.Scanner;

public class cAPSlOCK {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int c = 0;
        int all = 0;
        if (s.length() == 1) {
            if (s.charAt(0) >= 'a' && s.charAt(0) <= 'z') {
                System.out.println((char) (s.charAt(0) - 32));
            } else {
                System.out.println((char) (s.charAt(0) + 32));
            }

        } else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                    c++;
                }
                if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                    all++;
                }
            }

        }
        if (c == 1 && s.charAt(0) >= 'a' && s.charAt(0) <= 'z') {
            System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1, s.length()).toLowerCase());

        } else if (all == s.length()) {
            System.out.println(s.toLowerCase());

        } else {
            System.out.println(s);
        }

    }

}
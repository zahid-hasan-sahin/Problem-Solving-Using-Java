import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        String res = "";
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                res = res + (char) (s2.charAt(i) + 1);
            } else {
                res = res + s2.charAt(i);
            }
        }
        if (s1.equals(res) || s2.equals(res)) {
            System.out.println("-1");
        } else {
            System.out.println(res);
        }

    }

}
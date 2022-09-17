import java.util.Scanner;

public class GoodString {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        StringBuilder s = new StringBuilder(scan.next());

        for (int i = 0; i < s.length() - 1; i += 2) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                if (i + 2 < s.length() && s.charAt(i + 1) != s.charAt(i + 2)) {
                    s.deleteCharAt(i);
                    i -= 2;
                } else {
                    s.deleteCharAt(i + 1);
                    i -= 2;
                }
            }

        }
        if (s.length() % 2 == 1) {
            s.deleteCharAt(s.length() - 1);
        }
        System.out.println(n-s.length());
        System.out.println(s);
    }

}
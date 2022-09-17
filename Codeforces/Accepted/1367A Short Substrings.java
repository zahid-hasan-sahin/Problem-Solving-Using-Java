import java.util.Scanner;

public class NewClass3 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            String s = scan.next();
            String r = String.valueOf(s.charAt(0));
            for (int i = 1; i < s.length()-1; i++) {
                r += s.charAt(i);
                ++i;
            }
            r +=s.charAt(s.length()-1);
            System.out.println(r);
        }

    }

}
import java.util.Scanner;

public class CharacterSwap {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            String k = scan.next();
            int c = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != k.charAt(i)) {
                    ++c;
                }
            }
            if (c == 2) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}
import java.util.Scanner;

public class InterviewwithOleg {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();

        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == 'o' && s.charAt(i + 1) == 'g' && s.charAt(i + 2) == 'o') {
                int j = i;
                ++i;
                while (i < n && s.charAt(i) == 'g' && s.charAt(i + 1) == 'o') {
                    i += 2;
                }
                s = s.substring(0, j) + "***" + s.substring(i);
               i-=3;
            }

        }

        System.out.println(s);
    }

}
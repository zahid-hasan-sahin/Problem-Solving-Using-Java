import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        while (total-- > 0) {
            String s = scan.next();
            int c = 0;
            char temp = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) != '?') {
                    c++;
                    break;
                }
                if (s.charAt(i) == '?') {

                    temp = s.charAt(i - 1);
                    if ((char) temp + 1 >= 'd') {
                        temp = 96;
                    }
                    if (s.charAt(i + 1) == (char) (temp + 1)) {
                        temp = (char) (temp + 1);

                    }
                    
                    s = s.substring(0, i) + (char) (temp + 1) + s.substring(i + 1, s.length());

                }

            }
            if (c > 0) {
                sb.append("-1\n");
            } else {
               
                sb.append(s+"\n");
            }
        }
        System.out.println(sb);

    }

}
import java.util.Scanner;

public class A {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        while (total-- > 0) {
            StringBuilder s = new StringBuilder(scan.next());

            if (s.length() == 1 && s.charAt(0) == '?') {
                sb.append("a\n");
            } else {
                int c = 0;
                char temp = 0;
                for (int i = 0; i < s.length() - 1; i++) {
                    if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) != '?') {
                        c++;
                        break;
                    }
                    if (s.charAt(i) == '?') {
                        if (i == 0) {
                            temp = 'a';
                        } else {
                            temp = s.charAt(i - 1);
                        }
                        if ((char) temp + 1 >= 'd') {
                            temp = 96;
                        }
                        if (s.charAt(i + 1) == (char) (temp + 1)) {
                            temp = (char) (temp + 1);

                        }
                        if ((char) temp + 1 >= 'd') {
                            temp = 96;
                        }
                        s = s.replace(i, i + 1, String.valueOf((char)(temp + 1)));
                        

                    }
                }
                if (c > 0) {
                    sb.append("-1\n");
                } else {
                    if (s.charAt(s.length() - 1) == '?') {
                        if (s.charAt(s.length() - 2) != 'c') {
                            s = s.replace(s.length() - 1, s.length(), String.valueOf(s.charAt(s.length() - 2) + 1));

                        } else {
                            s = s.replace(s.length() - 1, s.length(), "a");

                        }
                    }
                    sb.append(s + "\n");
                }
            }

        }
        System.out.println(sb);

    }
}
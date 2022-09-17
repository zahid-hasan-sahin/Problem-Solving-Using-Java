import java.util.Scanner;

public class main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuffer sb = new StringBuffer();
        while (t-- > 0) {
            String s = scan.next();
            if (s.charAt(0) == 'R' && s.charAt(1) >= '0' && s.charAt(1) <= '9') {

                String row = "";
                String col = "";
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == 'R') {
                        for (int j = i; s.charAt(j) != 'C' && j < s.length(); j++) {
                            if (Character.isDigit(s.charAt(j))) {
                                row += s.charAt(j);
                            }

                        }

                    } else if (s.charAt(i) == 'C') {
                        for (int j = i; j < s.length(); j++) {
                            if (Character.isDigit(s.charAt(j))) {
                                col += s.charAt(j);
                            }
                        }
                    }
                }
                int tcol = Integer.valueOf(col);
                int temp = tcol;
                col = "";
                while (tcol > 0) {
                    col += (char) (tcol % 26 + 64);
                    if (tcol % 26 == 0) {
                        tcol = (tcol - 1) / 26;
                    } else {
                        tcol = tcol / 26;
                    }
                }
                String column = "";
                for (int j = col.length() - 1; j >= 0; j--) {
                    if (col.charAt(j) == '@') {
                        column += "Z";
                    } else {
                        column += col.charAt(j);

                    }
                }

                sb.append(column + "" + row + "\n");

            } else {
                int i = 0;
                int col = 0;
                String row = "";
                while (s.charAt(i) > '9') {
                    col += (s.charAt(i) - 64);
                    if (s.charAt(i + 1) <= '9') {
                        for (i = i + 1; i < s.length(); i++) {
                            row += s.charAt(i);
                        }
                        break;
                    }
                    col = col * 26;
                    ++i;
                }
                sb.append("R" + row + "C" + col + "\n");
            }

        }
        System.out.println(sb);

    }

}
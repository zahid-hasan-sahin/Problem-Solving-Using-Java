import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int check = 0;
        ArrayList<String> st = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            st.add(scan.next());
            if (check > 0) {
                continue;
            }
            for (int j = 0; j < 4; j++) {
                if (st.get(i).charAt(j) == 'O' && st.get(i).charAt(j + 1) == 'O') {
                    if (check > 0) {
                        continue;
                    }
                    if (j == 0) {
                        if (st.get(i).charAt(j + 3) == 'X') {
                            st.set(i, "++|Xo");
                        } else if (st.get(i).charAt(j + 4) == 'X') {
                            st.set(i, "++|OX");
                        } else {
                            st.set(i, "++|OO");
                        }
                        ++check;

                    } else {
                        if (st.get(i).charAt(j - 3) == 'X') {
                            st.set(i, "XO|++");
                        } else if (st.get(i).charAt(j - 2) == 'X') {
                            st.set(i, "OX|++");
                        } else {
                            st.set(i, "OO|++");
                        }
                        ++check;
                    }

                }
            }
        }
        if (check > 0) {
            System.out.println("YES");
            for (String res : st) {
                System.out.println(res);
            }
        } else {
            System.out.println("NO");
        }

    }
}
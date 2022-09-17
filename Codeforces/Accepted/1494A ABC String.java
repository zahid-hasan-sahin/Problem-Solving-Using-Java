import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NewClass1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        l:
        while (t-- > 0) {
            String s = scan.next();
            int[] a = new int[3];
            for (int i = 0; i < s.length(); i++) {
                ++a[s.charAt(i) - 'A'];
            }
            boolean b = false;
            Stack<Character> st = new Stack<Character>();;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'A') {
                    st.add('(');
                } else if (st.size() == 0) {
                    b = true;
                } else {
                    st.pop();
                }
            }
            if (st.size() == 0 && !b) {
                System.out.println("YES");
                continue l;
            }
            st.clear();
            b = false;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'B') {
                    st.add('(');
                } else if (st.size() == 0) {
                    b = true;
                } else {
                    st.pop();
                }
            }
            if (st.size() == 0 && !b) {
                System.out.println("YES");
                continue l;
            }
            st.clear();
            b = false;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'C') {
                    st.add('(');
                } else if (st.size() == 0) {
                    b = true;
                } else {
                    st.pop();
                }
            }
            if (st.size() == 0 && !b) {
                System.out.println("YES");
                continue l;
            }
            b = false;
            st.clear();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != 'A') {
                    st.add('(');
                } else if (st.size() == 0) {
                    b = true;
                } else {
                    st.pop();
                }
            }
            if (st.size() == 0 && !b) {
                System.out.println("YES");
                continue l;
            }
            st.clear();
            b = false;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != 'B') {
                    st.add('(');
                } else if (st.size() == 0) {
                    b = true;
                } else {
                    st.pop();
                }
            }
            if (st.size() == 0 && !b) {
                System.out.println("YES");
                continue l;
            }
            st.clear();
            b = false;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != 'C') {
                    st.add('(');
                } else if (st.size() == 0) {
                    b = true;
                } else {
                    st.pop();
                }
            }
            if (st.size() == 0 && !b) {
                System.out.println("YES");
                continue l;
            }
            System.out.println("NO");
        }
    }

}
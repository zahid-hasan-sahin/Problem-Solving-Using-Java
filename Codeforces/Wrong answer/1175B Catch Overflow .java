import java.util.Scanner;
import java.util.Stack;

public class CatchOverflow {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long curr = 1;
        long res = 0;
        Stack<Long> st = new Stack<Long>();
        int range = 0;
        long lim = 1000000000000000l;
        long p = (long) Math.pow(2, 32) - 1;
        for (int i = 0; i < n; i++) {
            String s = scan.next();
            if (s.equals("for")) {
                long in = scan.nextInt();
                st.add(in);
                if (curr * in <= lim) {
                    range = st.size();
                    curr *= in;
                }
            } else if (s.equals("add")) {
                res += curr;
                if (res > p) {
                    System.out.println("OVERFLOW!!!");
                    return;
                }
            } else {
                if (st.size() <= range) {
                    curr /= st.peek();
                    st.pop();
                    range = st.size();
                } else {
                    st.pop();
                }
            }

        }
        if (res > p) {
            System.out.println("OVERFLOW!!!");
            return;
        }
        System.out.println(res);
    }

}
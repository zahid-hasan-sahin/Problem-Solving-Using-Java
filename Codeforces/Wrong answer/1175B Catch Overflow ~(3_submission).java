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
        long lim = 100000000000000l;
        for (int i = 0; i < n; i++) {
            String s = scan.next();
            if (s.equals("for")) {
                long in = scan.nextInt();
                st.add(in);
                if (curr * in < lim) {
                    range = st.size();
                    curr *= in;
                }
            } else if (s.equals("add")) {
                res += curr;
                if (res > lim) {
                    System.out.println("OVERFLOW!!!");
                    return;
                }
            } else {
                if (st.size() == range) {
                    range = st.size();
                    curr /= st.peek();
                    st.pop();
                }
            }

        }
        if (res > Math.pow(2, 32) - 1) {
            System.out.println("OVERFLOW!!!");
            return;
        }
        System.out.println(res);
    }

}
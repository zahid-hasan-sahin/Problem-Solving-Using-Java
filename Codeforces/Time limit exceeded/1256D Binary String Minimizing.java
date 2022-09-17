import java.util.Scanner;

public class BinaryStringMinimizing {

    static String swap(String str, int i, int j) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            String s = scan.next();
            int e = 0;
            int c = 0;
            for (int i = 0; i < n && k > 0; i++) {
                if (s.charAt(i) == '0') {                
                    s = swap(s, i, Math.max(e, i - k));
              
                    k -= (i - e);
                    ++e;
                }
           
            }
            System.out.println(s);
        }
    }

}
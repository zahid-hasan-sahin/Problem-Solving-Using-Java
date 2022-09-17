import java.util.Scanner;

public class cfContest1567 {
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            StringBuilder sb = new StringBuilder();
            
            for (int i = 0; i < n; i++) {
                
                if (s.charAt(i) == 'U') {
                    sb.append("D");
                } else if (s.charAt(i) == 'L') {
                    sb.append("L");
                } else if (s.charAt(i) == 'D') {
                    sb.append("U");
                } else {
                    sb.append("R");
                }
            }
            System.out.println(sb);
        }
    }
    
}
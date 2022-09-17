import java.util.Scanner;

public class OmkarandBedWars {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            s += s.charAt(0);
            long res = 0;
            for (int i = 0; i <= n; i++) {
                int p = i;             
                if (s.charAt(i) == 'L') {
                    while (i <= n && s.charAt(i) == 'L') {
                        ++i;
                    }
                } else {
                    while (i <= n && s.charAt(i) == 'R') {
                        ++i;
                    }
                }
                --i;
                
                res += Math.floor((i + 1 - p) / 3);

            }
            System.out.println(res);
        }
    }
}
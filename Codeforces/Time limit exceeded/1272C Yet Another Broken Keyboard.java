import java.util.Scanner;

public class Main{

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        String s = scan.next();
        boolean[] ch = new boolean[26];
        for (int i = 0; i < k; i++) {
            ch[scan.next().charAt(0) - 'a'] = true;
        }
        int res = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                for (int l = i; l < j; l++) {
                    if (ch[s.charAt(l) - 'a'] == true) {                       
                        ++count;
                    } else {
                        break;
                    }
                }
                if (count == j-i) {
                    ++res;
                }
                count = 0;
            }
        }
        System.out.println(res);

    }

}
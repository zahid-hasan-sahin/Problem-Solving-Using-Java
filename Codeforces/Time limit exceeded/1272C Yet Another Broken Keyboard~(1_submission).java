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
                String temp = s.substring(i, j);
                for (int l = 0; l < temp.length(); l++) {
                    if (ch[temp.charAt(l) - 'a'] == true) {
                        ++count;
                    } else {
                        break;
                    }
                }
                if (count == temp.length()) {
                    ++res;
                }
                count = 0;
            }
        }
        System.out.println(res);

    }

}
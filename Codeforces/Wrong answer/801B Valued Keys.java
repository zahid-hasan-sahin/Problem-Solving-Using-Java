import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        String res = "";
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                res = res + (char) (s2.charAt(i) + 1);
                ++count;
            } else {
                res = res + s2.charAt(i);
                if (s1.charAt(i) >= res.charAt(i)) {
                    ++count;
                }
            }

        }
        if(count==s1.length()){
            System.out.println(res);
        }else{
            System.out.println("-1");
        }

    }

}
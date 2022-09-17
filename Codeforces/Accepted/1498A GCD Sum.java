import java.util.Scanner;

public class NewClass7 {

    public static long gcd(long a, long b) {
        while (b != 0) {
            long t = a;
            a = b;
            b = t % b;
        }
        return a;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while (t-- > 0) {
            Long n = scan.nextLong();
            while(true){
                String s = String.valueOf(n);
                int sum = 0;
                for (int i = 0; i < s.length(); i++) {
                    sum += s.charAt(i)-'0';
                }
                if(gcd(n,Long.valueOf(sum))>1){
                    System.out.println(n);
                    break;
                }
                ++n;
            }
        }

    }

}
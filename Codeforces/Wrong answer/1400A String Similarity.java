import java.util.Scanner;

public class NewClass2 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
        //    System.out.println(s);
            for (int i = 0; i < n-1; i++) {
                System.out.print(s.charAt(i));
            }
            System.out.println(s.charAt(n-1));
            
            
        }
        
    }
}
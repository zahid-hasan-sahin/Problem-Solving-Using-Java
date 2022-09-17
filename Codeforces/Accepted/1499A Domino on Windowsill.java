import java.util.Scanner;

public class NewClass5 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();
            int w = scan.nextInt();
            int c = scan.nextInt();
            int k = (a + b) / 2;
            int p = ((n * 2) - (a + b)) / 2;
            if (k >= w && p>=c) {
                System.out.println("YES");

            }else{
                System.out.println("NO");
            }
        }
    }

}
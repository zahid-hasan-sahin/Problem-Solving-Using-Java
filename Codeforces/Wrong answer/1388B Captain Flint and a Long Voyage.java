import java.util.Scanner;

public class NewClass8 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int q = scan.nextInt();
        while (q-- > 0) {
           int n = scan.nextInt();
            for (int i = 0; i < n-1; i++) {
                System.out.print("9");
            }
            System.out.println("8");

        }
    }

}
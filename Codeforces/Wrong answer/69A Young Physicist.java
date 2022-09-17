import java.util.Scanner;

public class YoungPhysicist {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        int temp = 0;
        for (int i = 0; i < total * 3; i++) {
            temp = temp + scan.nextInt();
        }
        if (temp <= 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
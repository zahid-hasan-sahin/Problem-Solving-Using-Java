import java.util.Scanner;

public class CME {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        while(total>0){
        int n = scan.nextInt();
        int t = n / 2;
        int c = 0;
        int d = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j == t && i + j + t == n) {
                    c++;
                } else {
                    if (i + j == n) {
                        d++;
                    }

                }

            }

        }

        if (c > 0) {
            System.out.println(0);
        } else if (n == 2) {

            System.out.println(2);

        } else {
            System.out.println(n - d);
        }
          total--;
    }
      
    }
    

}
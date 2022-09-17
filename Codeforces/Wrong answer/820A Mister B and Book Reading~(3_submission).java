import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();
        int v1 = scan.nextInt();
        int v2 = scan.nextInt();
        int a = scan.nextInt();
        int l = scan.nextInt();
        int countReadedPages = 0;
        int readingSpeed = 0;
        int reRead = 0;
        int day = 0;
        while (c > countReadedPages) {
            if (day * readingSpeed <= v2) {
                countReadedPages += (v1 + (day * readingSpeed) - (reRead));
            }else{
                countReadedPages += (v1 + v2 - (reRead));
            }
            readingSpeed = a;
            reRead = l;
            ++day;

        }
        System.out.println(day);
    }

}
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int t = scan.nextInt();
        String s = "";
        if(t==10){
            for (int i = 0; i < n-2; i++) {
                s = s + n;
            }
            s = s + 10;
            System.out.println(s);
        }else{
            for (int i = 0; i < n; i++) {
                s = s + t;
            }
            System.out.println(s);
        }
        
    }

}
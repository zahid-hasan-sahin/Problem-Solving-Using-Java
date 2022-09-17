import java.util.Scanner;

public class main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            String s = scan.next();
            if(s.contains("8") && s.length()-s.indexOf("8")>=11){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        
    }  
}
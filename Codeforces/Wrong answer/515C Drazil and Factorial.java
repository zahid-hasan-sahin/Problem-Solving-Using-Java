import java.util.Scanner;

public class main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String s = scan.next();
        String res="";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!='1' && s.charAt(i)!=0){
                res += s.charAt(i);
            }
        }
        System.out.println(res);
        
        
        
    }
    
}
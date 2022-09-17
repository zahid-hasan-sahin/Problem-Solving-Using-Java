import java.util.Scanner;

public class NewClass4 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuffer sb = new StringBuffer();
        while(t-->0){
            int n = scan.nextInt();
            if(n%2==0){
                String res = "";
                for (int i = 0; i < n/2; i++) {
                    res +="1";
                }
                sb.append(res+"\n");
            }else{
                String res ="";
                for (int i = 0; i < (n-3)/2; i++) {
                    res +="1";
                }
                res += "7";
                sb.append(res+"\n");
                
            }
        }
        System.out.println(sb);
        

    }

}
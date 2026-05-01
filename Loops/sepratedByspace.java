
import java.util.Scanner;

public class sepratedByspace {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int l = sc.nextInt();
        int u = sc.nextInt();
        
        for(int i = l; i<=u; i++){
            int count=0;
            if(i<2){
                continue;
            }
            
            for(int j =2; j <= Math.sqrt(i); j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(i+" ");
            }
        }
    }
}

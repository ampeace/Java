
import java.util.Scanner;

public class divisiblity_check {
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        Integer N = sc.nextInt();
        int count=0;
        int temp = N;
        
        while(temp>0){
           int digit = temp %10;
            if(digit%2==0){
                count++;
            }
            temp/=10;
        }
        if(count==0){
    
            System.out.println("There are no even digits in the number.");
        }
        else if(N%count==0){
            System.out.println("It is a divisor of the original number.");
            
        }
        else{
            System.out.println("It is not a divisor of the original number.");
        }
        sc.close();
    }
}

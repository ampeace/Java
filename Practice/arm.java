import java.util.*;

public class arm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int originalnum = num;
        int rem = 0;
        int result = 0;

        // Count digits
        int n = 0;
        int temp = num;
        while (temp != 0) {
            temp = temp / 10;
            n++;
        }

        // Armstrong calculation
        temp = num;
        while (temp != 0) {
            rem = temp % 10;
            result += (int)Math.pow(rem, n);  // Using Math.pow to calculate rem^n
            temp = temp / 10;
        }

        // Result check
        if (result == originalnum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}
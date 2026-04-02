import java.util.*;

public class arm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int originalnum = num;
        int rem = 0;
        int result = 0;

        int n = 0;
        int temp = num;

        while (temp != 0) {
            temp /= 10;
            n++;
        }

        temp = num;
        while (temp != 0) {
            rem = temp % 10;
            result += (int)Math.pow(rem, n);
            temp /= 10;
        }

        if (result == originalnum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}
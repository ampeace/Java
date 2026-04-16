 import java.util.*;

public class nonZero_product {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int product = 1;

        // Convert number to string to use for-each loop
        for (char ch : String.valueOf(n).toCharArray()) {

            int digit = ch - '0'; // convert char to int

            if (digit != 0) {
                product *= digit; // multiply non-zero digits
            }
        }

        System.out.println(product);

        sc.close();
    }
}

import java.util.*;

// Class that contains overloaded sum methods
class Summation {

    // Method to calculate sum of two integers
    int sum(int x, int y) {
        return x + y;
    }

    // Overloaded method to calculate sum of three integers
    int sum(int x, int y, int z) {
        return x + y + z;
    }
}

public class SumSum {
    public static void main(String[] args) {

        // Scanner to take input
        Scanner scanner = new Scanner(System.in);

        // Input for two integers
        int m  = scanner.nextInt();
        int n = scanner.nextInt();

        // Input for three integers
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Create object of Summation class
        Summation summation = new Summation();

        // Call overloaded methods
        int sum2 = summation.sum(m, n);       // sum of two numbers
        int sum3 = summation.sum(a, b, c);    // sum of three numbers

        // Print results
        System.out.println("Sum of two integers: " + sum2);
        System.out.println("Sum of three integers: " + sum3);

        // Close scanner
        scanner.close();
    }
}
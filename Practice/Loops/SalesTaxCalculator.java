import java.util.*;

// Class that contains overloaded methods
class SalesTaxCalculato {

    // Method for integer inputs
    // Calculates final price using integer values
    public static int calculateFinalPrice(int price, int taxRate) {
        // Formula: price + ((price * taxRate) / 100)
        return price + (price * taxRate) / 100;
    }

    // Method for double inputs (method overloading)
    // Calculates final price using double values
    public static double calculateFinalPrice(double price, double taxRate) {
        // Formula: price + ((price * taxRate) / 100)
        return price + (price * taxRate) / 100.0;
    }
}

public class SalesTaxCalculator{
    public static void main(String[] args) {

        // Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Taking integer inputs
        int intPrice = scanner.nextInt();      // price as integer
        int intTaxRate = scanner.nextInt();    // tax rate as integer

        // Taking double inputs
        double doublePrice = scanner.nextDouble();   // price as double
        double doubleTaxRate = scanner.nextDouble(); // tax rate as double

        // Calling overloaded method for integer values
        int finalPriceInt = SalesTaxCalculato.calculateFinalPrice(intPrice, intTaxRate);

        // Calling overloaded method for double values
        double finalPriceDouble = SalesTaxCalculato.calculateFinalPrice(doublePrice, doubleTaxRate);

        // Printing integer result
        System.out.println(finalPriceInt);

        // Printing double result rounded to 2 decimal places
        System.out.format("%.2f", finalPriceDouble);

        // Closing scanner
        scanner.close();
    }
}
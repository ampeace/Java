import java.util.*;

enum Shape {
    SQUARE, TRIANGLE
}

public class enum_example {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next().toUpperCase();

        try {
            Shape shape = Shape.valueOf(input);

            if (shape == Shape.SQUARE) {
                double a = sc.nextDouble();
                double area = a * a;
                System.out.printf("%.2f", area);
            } 
            else if (shape == Shape.TRIANGLE) {
                double b = sc.nextDouble();
                double h = sc.nextDouble();
                double area = 0.5 * b * h;
                System.out.printf("%.2f", area);
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}
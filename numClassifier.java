import java.util.*;

class NumberClassifier {

    int n;

    public void classifyNumbers(int[] arr) {
        // nothing needed here (as per snippet)
    }

    public void printEvenNumbers(int[] arr) {
        System.out.print("Even numbers: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public void printOddNumbers(int[] arr) {
        System.out.print("Odd numbers: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

public class numClassifier { 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        NumberClassifier obj = new NumberClassifier();

        obj.n = scanner.nextInt();
        int[] arr = new int[obj.n];

        for (int i = 0; i < obj.n; i++) {
            arr[i] = scanner.nextInt();
        }

        obj.classifyNumbers(arr);
        obj.printEvenNumbers(arr);
        obj.printOddNumbers(arr);

        scanner.close();
    }
}
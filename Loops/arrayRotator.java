import java.util.*;

class ArrayRotator {

    int[] arr;
    int n, m;

    public ArrayRotator(int[] originalArray, int size, int positions) {
        arr = originalArray;
        n = size;
        m = positions;
    }

    public void rotateRight() {
        m = m % n;

        int[] result = new int[n];

        for (int i = 0; i < m; i++) {
            result[i] = arr[n - m + i];
        }

        for (int i = m; i < n; i++) {
            result[i] = arr[i - m];
        }

        arr = result;
    }

    public void display() {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class arrayRotator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        ArrayRotator ar = new ArrayRotator(arr, n, m);
        ar.rotateRight();
        ar.display();

        sc.close();
    }
}
import java.util.*;

public class peakElement {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int peak = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < n; i++) {

            boolean left = (i == 0) || (arr[i] > arr[i - 1]);
            boolean right = (i == n - 1) || (arr[i] > arr[i + 1]);

            if (left && right) {
                if (arr[i] > peak) { // choose maximum peak
                    peak = arr[i];
                    index = i;
                }
            }
        }

        System.out.println("Peak Element: " + peak + " at index " + index);

        sc.close();
    }
}
    


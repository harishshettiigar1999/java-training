package daythree.mite;

import java.util.Scanner;

public class DuplicateVsNum {
    static Scanner scan = new Scanner(System.in);

    private static void CheckNumberDiv(int[] arr, boolean[] repeated, int repCount, int n) {
        if (repCount == 0) {
            System.out.println("No item is repeated. . .");
            return;
        }
        int[] prev = new int[repCount];
        int ptr = 0;

        System.out.print("Enter NUM :");
        int NUM = scan.nextInt();
        for (int i = 0; i < n; i++) {
            if (repeated[i] && (!DuplicateProduct.binarySearch(prev, 0, ptr, arr[i], -1)) && arr[i] % NUM == 0) {
                System.out.println(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        // Input
        System.out.print("Enter Length of Array :");
        int n = scan.nextInt();

        int[] arr = new int[n];
        int repCount = 0;
        boolean[] repeated = new boolean[n];

        System.out.println("Enter the value of Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            // Search in current array and if present mark it repeated
            if (DuplicateProduct.binarySearch(arr, 0, i, arr[i], i)) {
                repeated[i] = true;
                repCount++;
            } else {
                repeated[i] = false;
            }
        }

        // Chech Which number is divisible
        CheckNumberDiv(arr, repeated, repCount, n);
    }
}

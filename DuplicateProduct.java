package daythree.mite;

import java.util.Scanner;

public class DuplicateProduct {
    static Scanner scan = new Scanner(System.in);

    public static boolean binarySearch(int[] arr, int l, int r, int x, int skipIndex) {
        // Worst time complexity log(n)
        if (r >= l) {
            int mid = l + (r - l) / 2;
            int firstEnd = mid - 1;
            if (arr[mid] == x) {
                if (skipIndex != mid)
                    return true;
                else {
                    firstEnd = mid;
                }
            }
            if (arr[mid] > x)
                return binarySearch(arr, l, firstEnd, x, skipIndex);
            return binarySearch(arr, mid + 1, r, x, skipIndex);
        }
        return false;
    }

    private static void computeProduct(int[] arr, boolean[] repeated, int repCount, int n) {
        if (repCount == 0) {
            System.out.println("No item is repeated. . .");
            return;
        }
        int product = 1;
        int[] prev = new int[repCount];
        int ptr = 0;
        for (int i = 0; i < n; i++) {
            if (repeated[i] && (!binarySearch(prev, 0, ptr, arr[i], -1))) {
                product *= arr[i];
                prev[ptr] = arr[i];
            }
        }

        System.out.println("Product = " + product);
    }

    public static void main(String[] args) {
        System.out.print("Enter Length of Array :");
        int n = scan.nextInt();

        int[] arr = new int[n];
        int repCount = 0;
        boolean[] repeated = new boolean[n];
        System.out.println("Enter the value of Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            // Search in current array and if present mark it repeated
            if (binarySearch(arr, 0, i, arr[i], i)) {
                repeated[i] = true;
                repCount++;
            } else {
                repeated[i] = false;
            }
        }

        // Compute Product
        computeProduct(arr, repeated, repCount, n);
    }
}

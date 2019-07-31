package daythree.mite;

import daytwo.mite.array.MergeSort;

import java.util.Scanner;

public class MaxMin {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter 'n' :");
        int n = scan.nextInt();

        System.out.print("Enter FirstArray :");
        double[] firstArray = new double[n];
        for (int i = 0; i < n; i++)
            firstArray[i] = scan.nextDouble();

        System.out.print("Enter SecondArray :");
        double[] secondArray = new double[n];
        for (int i = 0; i < n; i++) {
            secondArray[i] = scan.nextDouble();
        }

        // Search Max from each
        MergeSort.sort(firstArray, 0, firstArray.length - 1);
        MergeSort.sort(secondArray, 0, secondArray.length - 1);

        int index = 0;
        int MIN = -1;
        while (index < firstArray.length) {
            if (firstArray[index] < secondArray[index]) {
                MIN = (int) firstArray[index];
                break;
            } else if (firstArray[index] > secondArray[index]) {
                MIN = (int) secondArray[index];
                break;
            } else
                index++;
        }
        index = firstArray.length - 1;
        int MAX = -1;
        while (index >= 0) {
            if (firstArray[index] > secondArray[index]) {
                MAX = (int) firstArray[index];
                break;
            } else if (firstArray[index] < secondArray[index]) {
                MAX = (int) secondArray[index];
                break;
            } else
                index--;
        }

        // Print the result
        System.out.println("Found MAX :" + MAX);
        System.out.println("Found MIN :" + MIN);
        System.out.println(" MAX << MIN : (" + MAX + " << " + MIN + " ) = " + (MAX << MIN));
    }
}

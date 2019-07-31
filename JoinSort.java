package daythree.mite;

//import daythree.mite.DuplicatePr

import java.util.Scanner;

public class JoinSort {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter 'n' :");
        int n = scan.nextInt();

        System.out.print("Enter FirstArray :");
        int[] firstArray = new int[10];
        for (int i = 0; i < n; i++)
            firstArray[i] = scan.nextInt();

        System.out.print("Enter SecondArray :");
        int[] secondArray = new int[10];
        for (int i = 0; i < n; i++)
            secondArray[i] = scan.nextInt();

        // Join
        int[] joinedArray = new int[n];
        System.out.println("Joined Values:");
        for (int i = 0; i < n; i++) {
            joinedArray[i] = join(firstArray[i], secondArray[i]);
            System.out.print(joinedArray[i] + " ");
        }


    }

    private static int join(int first, int second) {
        int shiftedNumber = (int) (first * Math.pow(10, digits(second)));
        return shiftedNumber + second;
    }

    private static int digits(int x) {
        byte count = 0;
        while (x != 0) {
            count++;
            x /= 10;
        }
        return count;
    }
}

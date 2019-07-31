package daythree.mite;
// 1. Bubble Sort:
//      String desired=”DataScience”;
//      Perform bubble sort on the given String. [ Convert the String to Byte ]

public class BubbleSort {
    private static void bubbleSort(byte[] arr) {
        // Bubble Sort Algorithm to Sort the Byte array.
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // Using XOR Swap
                    arr[j] ^= arr[j + 1];
                    arr[j + 1] ^= arr[j];
                    arr[j] ^= arr[j + 1];
                }
        System.out.println("Sorted Word : " + new String(arr));
    }

    public static void main(String[] args) {
        String desired = "DataScience";
        System.out.println("Original Word : " + desired);
        bubbleSort(desired.getBytes());  // getBytes : String -> Byte Array.
    }
}

package daythree.mite;
// 2. Insertion Sort:
//      String domain=”ComputerNetworks”;
//      Perform >> of each char by 3, then do the insertion sort in the resulted values.

public class InsertionSort {
    private static void insertionSort(byte[] arr) {
        // Bubble Sort Algorithm to Sort the Byte array.
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            byte key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println("Sorted Word : " + new String(arr));
    }

    public static void main(String[] args) {
        String domain = "ComputerNetwork";
        System.out.println("Original Word : " + domain);
        insertionSort(domain.getBytes());
    }
}

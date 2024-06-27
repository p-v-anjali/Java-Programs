import java.util.Arrays;

public class QuickSrt {
    public static void main(String[] args) {
        String[] names = { "John", "Alice", "Bob", "David", "Emma", "Frank", "Cathy" };

        System.out.println("Original list of names:");
        printArray(names);

        quickSort(names, 0, names.length - 1);

        System.out.println("\nSorted list of names:");
        printArray(names);
    }

    public static void quickSort(String[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;

                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        String temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void printArray(String[] arr) {
        for (String name : arr) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}

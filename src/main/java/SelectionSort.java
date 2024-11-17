import java.util.Arrays;

public class SelectionSort {
    public void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        SelectionSort sorter = new SelectionSort();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        sorter.selectionSort(arr);
        System.out.println("Sortiertes Array: " + Arrays.toString(arr));
    }
}

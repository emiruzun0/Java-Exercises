import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] originalArr = {64, 25, 12, 22, 11};

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(originalArr));

        // Selection Sort
        Integer[] selectionSortArr = Arrays.copyOf(originalArr, originalArr.length);
        System.out.println("Original Array (Selection Sort): " + Arrays.toString(selectionSortArr));
        SelectionSort<Integer> selectionSort = new SelectionSort<>();
        selectionSort.sort(selectionSortArr);
        System.out.println("Sorted Array (Selection Sort): " + Arrays.toString(selectionSortArr));

        // Bubble Sort
        Integer[] bubbleSortArr = Arrays.copyOf(originalArr, originalArr.length);
        System.out.println("Original Array (Bubble Sort): " + Arrays.toString(bubbleSortArr));
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        bubbleSort.sort(bubbleSortArr);
        System.out.println("Sorted Array (Bubble Sort): " + Arrays.toString(bubbleSortArr));

        // Insertion Sort
        Integer[] insertionSortArr = Arrays.copyOf(originalArr, originalArr.length);
        System.out.println("Original Array (Insertion Sort): " + Arrays.toString(insertionSortArr));
        InsertionSort<Integer> insertionSort = new InsertionSort<>();
        insertionSort.sort(insertionSortArr);
        System.out.println("Sorted Array (Insertion Sort): " + Arrays.toString(insertionSortArr));

        // Shell Sort
        Integer[] shellSortArr = Arrays.copyOf(originalArr, originalArr.length);
        System.out.println("Original Array (Shell Sort): " + Arrays.toString(shellSortArr));
        ShellSort<Integer> shellSort = new ShellSort<>();
        shellSort.sort(shellSortArr);
        System.out.println("Sorted Array (Shell Sort): " + Arrays.toString(shellSortArr));

        // Merge Sort
        Integer[] mergeSortArr = Arrays.copyOf(originalArr, originalArr.length);
        System.out.println("Original Array (Merge Sort): " + Arrays.toString(mergeSortArr));
        MergeSort<Integer> mergeSort = new MergeSort<>();
        mergeSort.sort(mergeSortArr);
        System.out.println("Sorted Array (Merge Sort): " + Arrays.toString(mergeSortArr));

        // Heap Sort
        Integer[] heapSortArr = Arrays.copyOf(originalArr, originalArr.length);
        System.out.println("Original Array (Heap Sort): " + Arrays.toString(heapSortArr));
        HeapSort<Integer> heapSort = new HeapSort<>();
        heapSort.sort(heapSortArr);
        System.out.println("Sorted Array (Heap Sort): " + Arrays.toString(heapSortArr));

        // Quick Sort
        Integer[] quickSortArr = Arrays.copyOf(originalArr, originalArr.length);
        System.out.println("Original Array (Quick Sort): " + Arrays.toString(quickSortArr));
        QuickSort<Integer> quickSort = new QuickSort<>();
        quickSort.sort(quickSortArr);
        System.out.println("Sorted Array (Quick Sort): " + Arrays.toString(quickSortArr));
    }
}

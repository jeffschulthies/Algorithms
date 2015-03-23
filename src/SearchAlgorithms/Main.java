package SearchAlgorithms;

/**
 * Created by Jeff Schulthies
 * .
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 90, 54, 76, 6, 14, 27, 3, 28, 99, 36, 197, 4};
        int[] array2 = {1, 2, 3, 4, 90, 500};
        //System.out.println(BinarySearch.functionalSelectionSort(array));
        array = BinarySearch.functionalInsertionSort(array);
        printArray(array);
    }
    public static void printArray(int[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

package SearchAlgorithms;

/**
 * Created by Jeff Schulthies
 * .
 */
public class BinarySearch {

    public static int[] bubbleSort(int[] a) {
        int swapCount = 0;

        while(true) {
            swapCount = 0;
            for(int i = 0; i < a.length - 1; i++) {
                if(a[i] > a[i + 1]){
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapCount++;
                }
            }
            if(swapCount == 0) {
                break;
            }
        }
        return a;
    }

    public static int[] functionalSelectionSort(int[] a) {
        int minimum = 0;
        int curIndex = 0;
        for(int i = 0; i < a.length; i++) {
            minimum = a[i];
            for(int j = i; j < a.length; j++) {
                if(a[j] <= minimum) {
                    minimum = a[j];
                    curIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[curIndex];
            a[curIndex] = temp;
        }
        return a;
    }

    public static int[] functionalInsertionSort(int[] a) {
        for(int i = 1; i < a.length; i++) {
            for(int j = i; j < a.length; j++) {

                //TODO Illustrate in notes
                while(j > 0 && (a[j - 1] > a[j])) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                    j--;
                }
            }
        }
        return a;
    }

/*    public static int[] mergeSort(int[] a) {

    }

    public static int[] mergeSort(int[] a, int[] b, int lo, int hi) {
        int mid = (lo + hi) / 2;
        //Merging
        if(lo >= hi) {

        }

    } */

    public static int[] quickSort(int[] a) {
        int i = 0;
        int j = a.length - 1;
        int mid = (j + i) / 2;
        int pivot = a[mid];
        while(i < j) {
            while (a[j] > pivot) {
                j--;
            }

            while (a[i] < pivot) {
                i++;
            }

            if (i < j) {
                int temp = a[j];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[mid];
        return a;
    }


    public static int functionalBinarySearch(int[] a, int key) {
        int lo = 0;
        int hi  = a.length - 1;

        while(lo < hi) {
            int mid = (lo + hi)/ 2;
            if(a[mid] == key) {
                return mid;
            } else if(a[mid] > key) {
                hi--;
            } else {
                lo++;
            }
        }

        return -1;

    }



    public static int recursiveBinarySearch(int[] a, int key, int lo, int hi) {
        int mid = (lo + hi) / 2;

        if(a[mid] == key) {
            return mid;
        } else if(lo >= hi) {
            return -1;
        }

        // 16 // 15
        if(a[mid] > key) {
            mid = recursiveBinarySearch(a, key, lo, mid - 1);

        } else {
            //lo++;
            mid = recursiveBinarySearch(a, key, mid + 1, hi);
        }
        //hi--;

        return mid;
    }

}

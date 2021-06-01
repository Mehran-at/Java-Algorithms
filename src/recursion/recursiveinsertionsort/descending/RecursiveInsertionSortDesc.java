package recursion.recursiveinsertionsort.descending;

import java.util.Arrays;

class RecursiveInsertionSortDesc {

    public static void main(String[] args) {

        int[] sourceArray = new int[] {2, 3, 1, 8, 7, 12, 2, -55, 89, 0};

        RecursiveInsertionSortDesc recursiveInsertionSort = new RecursiveInsertionSortDesc();
        recursiveInsertionSort.doInsertionSortRecursive(sourceArray, 0);
        System.out.println(Arrays.toString(sourceArray));
    }

    private void doInsertionSortRecursive(int[] sourceArray, int idx) {

        if (idx >= sourceArray.length) {
            return;
        }

        doInsertionSortRecursive(sourceArray, idx + 1);
        System.out.println("--->" + idx);

        int tempValue = sourceArray[idx];
        int nextIdx = idx + 1;
        while (nextIdx < sourceArray.length && sourceArray[nextIdx] > tempValue) {
            sourceArray[nextIdx - 1] = sourceArray[nextIdx]; // [0] = [1]
            nextIdx++;
        }
        sourceArray[nextIdx - 1] = tempValue;
    }
}
/*
    https://www.youtube.com/watch?v=M6lYob
 */


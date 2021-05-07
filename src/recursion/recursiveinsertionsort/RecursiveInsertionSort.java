package recursion.recursiveinsertionsort;

import java.util.Arrays;

class RecursiveInsertionSort {

    public static void main(String[] args) {

        int[] sourceArray = new int[] {2, 3, 1, 8, 7};

        RecursiveInsertionSort recursiveInsertionSort = new RecursiveInsertionSort();
        recursiveInsertionSort.doInsertionSortRecursive(sourceArray, sourceArray.length);
        System.out.println(Arrays.toString(sourceArray));
    }

    private void doInsertionSortRecursive(int[] sourceArray, int arraysLength) {

        if (arraysLength <= 1) {

            return;
        }

        doInsertionSortRecursive(sourceArray, arraysLength - 1);
        System.out.println("--->" + arraysLength);

        int lastIdx = sourceArray[arraysLength - 1];
        int j = arraysLength - 2;

        while (j >= 0 && sourceArray[j] > lastIdx) {
            sourceArray[j + 1] = sourceArray[j];
            j--; // 2
        }
        sourceArray[j + 1] = lastIdx;
    }
}

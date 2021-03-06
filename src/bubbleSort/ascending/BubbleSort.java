package bubbleSort.ascending;

import java.util.Arrays;

class BubbleSort {

    public static void main(String[] args) {
//                                     0  1  2  3  4  5
        int[] sourceArray = new int[] {5, 8, 1, 6, 9, 2, 11, -1};

        bubbleSortBeta(sourceArray);
        bubbleSort(sourceArray);

    }

    private static int[] bubbleSort(int[] sourceArray) {

        int counter = 0;

        int temp;

        if (sourceArray.length <= 1) {

            System.out.println(Arrays.toString(sourceArray));
            return sourceArray;
        }

        for (int item : sourceArray) {
            for (int i = 1 ; i < sourceArray.length ; i++) {
                counter++;
                if (sourceArray[i - 1] > sourceArray[i]) {

                    temp = sourceArray[i];
                    sourceArray[i] = sourceArray[i - 1];
                    sourceArray[i - 1] = temp;
                }
            }
        }
        System.out.println(counter);
        System.out.println(Arrays.toString(sourceArray));
        return sourceArray;
    }

    private static void bubbleSortBeta(int[] sourceArray) {

        System.out.println(Arrays.toString(sourceArray));

        int counter = 0;
        int temp;
        if (sourceArray.length <= 1) {
            System.out.println(Arrays.toString(sourceArray));
        }

        for (int i = 0 ; i < sourceArray.length ; i++) {
            for (int j = i ; j < sourceArray.length ; j++) {
                counter++;
                if (sourceArray[j] < sourceArray[i]) {
                    temp = sourceArray[j];
                    sourceArray[j] = sourceArray[i];
                    sourceArray[i] = temp;
                }
            }
        }

        System.out.println(counter);
        System.out.println(Arrays.toString(sourceArray));
    }
}
/*
    Bubble Sort is not an efficient sorting algorithm because it uses nested loops.

    it is useful only for small data sets.

    it runs in O(n^2)
 */
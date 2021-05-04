package insertionSort;

import java.util.Arrays;

class InsertionSort {

    public static void main(String[] args) {
//        task is to sort items in increasing order via Insertion Sort.
//                                   0  1  2  3  4  5
        int[] intArrays = new int[] {5, 8, 1, 3, 9, 6};
//        Here we have a list of six items. And the first element is already sorted.

//        The definition of sorted here means are items to the left of that item are smaller than that item.

        System.out.println(Arrays.toString(sortIntArraysAscending(intArrays)));
    }

    static int[] sortIntArraysAscending(int[] intArrays) {

        int key, indexOfElementBeforeKey, temp;

        for (int item = 1 ; item < intArrays.length ; item++) {
            key = intArrays[item];
            indexOfElementBeforeKey = item - 1;

            while (indexOfElementBeforeKey >= 0 && key < intArrays[indexOfElementBeforeKey]) {
                temp = intArrays[indexOfElementBeforeKey];
                intArrays[indexOfElementBeforeKey] = intArrays[indexOfElementBeforeKey + 1];
                intArrays[indexOfElementBeforeKey + 1] = temp;
                indexOfElementBeforeKey--;
            }
        }
        return intArrays;
    }
}
/*
    Insertion sort is not considered a fast sorting algorithm, because it uses nested loops to shift items into places.

    It is useful only for small data sets.

    It runs in O(n ^ 2)
 */
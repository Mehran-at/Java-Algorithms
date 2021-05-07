package mergeSort.ascending;

import java.util.Arrays;

class MergeSort {

    public static void main(String[] args) {

        int[] sourceArray = new int[] {17, 87, 6, 22, 41, 3, 13, 54};
        System.out.println("Initial Array is: " + Arrays.toString(sourceArray));

        mergeSort(sourceArray);

        sortArray(sourceArray);
    }

    private static int[] mergeSort(int[] sourceArray) {

        if (sourceArray.length <= 1) {

            return sourceArray;
        }

        int midIdx = sourceArray.length / 2;

        int[] leftHalfSide = new int[midIdx];
        int[] rightHalfSide;

        if (sourceArray.length % 2 == 0) {
            rightHalfSide = new int[midIdx];
        } else {
            rightHalfSide = new int[midIdx + 1];
        }

        // Populate the left Half Side and right Half Side arrays.
        for (int i = 0 ; i < midIdx ; i++) {
            leftHalfSide[i] = sourceArray[i];
        }

        for (int j = 0 ; j < rightHalfSide.length ; j++) {
            rightHalfSide[j] = sourceArray[midIdx + j];
        }

        int[] resultArray = new int[sourceArray.length];

        leftHalfSide = mergeSort(leftHalfSide);
        rightHalfSide = mergeSort(rightHalfSide);

        resultArray = merge(leftHalfSide, rightHalfSide);
        System.out.println("\n Recursive Merge Sort Array attempt: " + Arrays.toString(resultArray));

        return resultArray;
    }

    private static int[] merge(int[] leftHalfSide, int[] rightHalfSide) {

        int[] resultArray = new int[leftHalfSide.length + rightHalfSide.length];

        int lowIdx, highIdx, resultArrayIndex;
        lowIdx = highIdx = resultArrayIndex = 0;

        while (lowIdx < leftHalfSide.length || highIdx < rightHalfSide.length) {

            if (lowIdx < leftHalfSide.length && highIdx < rightHalfSide.length) {

                if (leftHalfSide[lowIdx] < rightHalfSide[highIdx]) {
                    resultArray[resultArrayIndex++] = leftHalfSide[lowIdx++];
                } else {
                    resultArray[resultArrayIndex++] = rightHalfSide[highIdx++];
                }
            } else if (lowIdx < leftHalfSide.length) {
                resultArray[resultArrayIndex++] = leftHalfSide[lowIdx++];
            } else if (highIdx < rightHalfSide.length) {
                resultArray[resultArrayIndex++] = rightHalfSide[highIdx++];
            }
        }
        System.out.println("\n Sorted Array result is: " + Arrays.toString(resultArray));

        return resultArray;
    }

    private static int[] sortArray(int[] sourceArray) {

        int[] sorted = new int[8];

        int i = sourceArray.length / 2;
        if (sourceArray.length > 0) {
            int[] firstHalfSource = Arrays.copyOfRange(sourceArray, 0, i);
            int[] secondHalfSource = Arrays.copyOfRange(sourceArray, i, sourceArray.length);
            System.out.println("\n" + Arrays.toString(firstHalfSource) + "\n");
            System.out.println(Arrays.toString(secondHalfSource) + "\n");

            if (firstHalfSource.length > 0) {

                int[] firstOfFirstHalfSource = Arrays.copyOfRange(firstHalfSource, 0, firstHalfSource.length / 2);
                int[] secondOfFirstHalfSource = Arrays.copyOfRange(firstHalfSource, firstHalfSource.length / 2, firstHalfSource.length);

                int[] firstOfSecondHalfSource = Arrays.copyOfRange(secondHalfSource, 0, secondHalfSource.length / 2);
                int[] secondOfSecondHalfSource = Arrays.copyOfRange(secondHalfSource, secondHalfSource.length / 2, secondHalfSource.length);

                System.out.println(Arrays.toString(firstOfFirstHalfSource) + "\n");
                System.out.println(Arrays.toString(secondOfFirstHalfSource) + "\n");

                System.out.println(Arrays.toString(firstOfSecondHalfSource) + "\n");
                System.out.println(Arrays.toString(secondOfSecondHalfSource) + "\n");

                if (firstOfFirstHalfSource.length > 0) {

                    int[] aa = Arrays.copyOfRange(firstOfFirstHalfSource, 0, firstOfFirstHalfSource.length / 2);
                    int[] bb = Arrays.copyOfRange(firstOfFirstHalfSource, firstOfFirstHalfSource.length / 2, firstOfFirstHalfSource.length);

                    int[] cc = Arrays.copyOfRange(secondOfFirstHalfSource, 0, secondOfFirstHalfSource.length / 2);
                    int[] dd = Arrays.copyOfRange(secondOfFirstHalfSource, secondOfFirstHalfSource.length / 2, secondOfFirstHalfSource.length);

                    int[] ee = Arrays.copyOfRange(firstOfSecondHalfSource, 0, firstOfSecondHalfSource.length / 2);
                    int[] ff = Arrays.copyOfRange(firstOfSecondHalfSource, firstOfSecondHalfSource.length / 2, firstOfSecondHalfSource.length);

                    int[] gg = Arrays.copyOfRange(secondOfSecondHalfSource, 0, secondOfSecondHalfSource.length / 2);
                    int[] hh = Arrays.copyOfRange(secondOfSecondHalfSource, secondOfSecondHalfSource.length / 2, secondOfSecondHalfSource.length);


                    System.out.println(Arrays.toString(aa) + "\n");
                    System.out.println(Arrays.toString(bb) + "\n");

                    System.out.println(Arrays.toString(cc) + "\n");
                    System.out.println(Arrays.toString(dd) + "\n");

                    System.out.println(Arrays.toString(ee) + "\n");
                    System.out.println(Arrays.toString(ff) + "\n");

                    System.out.println(Arrays.toString(gg) + "\n");
                    System.out.println(Arrays.toString(hh) + "\n");

                    int[] aaa;

                    if (aa[0] < bb[0]) {
                        aaa = new int[] {aa[0], bb[0]};
                    } else {
                        aaa = new int[] {bb[0], aa[0]};
                    }
                    int[] bbb;
                    if (cc[0] < dd[0]) {
                        bbb = new int[] {cc[0], dd[0]};
                    } else {
                        bbb = new int[] {dd[0], cc[0]};
                    }
                    int[] ccc;

                    if (ee[0] < ff[0]) {
                        ccc = new int[] {ee[0], ff[0]};
                    } else {
                        ccc = new int[] {ff[0], ee[0]};
                    }
                    int[] ddd;
                    if (gg[0] < hh[0]) {
                        ddd = new int[] {gg[0], hh[0]};
                    } else {
                        ddd = new int[] {hh[0], gg[0]};
                    }


                    System.out.println(Arrays.toString(aaa));
                    System.out.println(Arrays.toString(bbb));
                    System.out.println(Arrays.toString(ccc));
                    System.out.println(Arrays.toString(ddd));

                    int[] aaa1 = new int[4];

                    if (aaa[0] < bbb[0]) {
                        aaa1[0] = aaa[0];
                        aaa1[1] = bbb[0];
                    } else {
                        aaa1[0] = bbb[0];
                        aaa1[1] = aaa[0];
                    }

                    if (aaa[1] < bbb[1]) {
                        aaa1[2] = aaa[1];
                        aaa1[3] = bbb[1];
                    } else {
                        aaa1[2] = bbb[1];
                        aaa1[3] = aaa[1];
                    }

                    int[] bbb1 = new int[4];

                    if (ccc[0] < ddd[0]) {
                        bbb1[0] = ccc[0];
                        bbb1[1] = ddd[0];
                    } else {
                        bbb1[0] = ddd[0];
                        bbb1[1] = ccc[0];
                    }

                    if (ccc[1] < ddd[1]) {
                        bbb1[2] = ccc[1];
                        bbb1[3] = ddd[1];
                    } else {
                        bbb1[2] = ddd[1];
                        bbb1[3] = ccc[1];
                    }

                    System.out.println("\n" + Arrays.toString(aaa1));
                    System.out.println(Arrays.toString(bbb1));

                    sorted = new int[8];
                    int ii = 0;
                    for (int j = 0 ; j < aaa1.length ; j++) {
                        if (aaa1[j] < bbb1[j]) {
                            sorted[ii] = aaa1[j];
                            sorted[++ii] = bbb1[j];
                        } else {
                            sorted[ii] = bbb1[j];
                            sorted[++ii] = aaa1[j];
                        }
                        ii++;
                    }
                }
            }
        }
        System.out.println("Hard Coded Solution: " + Arrays.toString(sorted));

        return sorted;
    }
}

/*
    https://www.toptal.com/developers/sorting-algorithms
    https://blog.faradars.org/sorting-lgorithms/

    Merge Sort is recursive (method that calls itself)

    Divide-and-Conquer algorithm

    Very efficient for large data sets.

    Merge Sort does log n ,erge steps because each merge step doubles the list size.

    It does n work for each merge step because it must look at every item.

    So it runs in O(n log n)
 */
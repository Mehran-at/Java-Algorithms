package integerNumSearch;

import java.util.*;

public class SearchInteger {

    public static void main(String[] args) {
        List<? extends Number> sourceList = Arrays.asList(22, 23.5, 1, 12.21, 01, -1, -1.5);
        System.out.println(findInteger(sourceList));
        System.out.println(findIntegerAsQueueList(sourceList));
    }

    private static List<Integer> findInteger(List<? extends Number> sourceList) {
        List<Integer> outputList = new ArrayList<>();
        int idx = 0;
        while (sourceList.size() > idx) {
            Number num = sourceList.get(idx);
            if (isObjectInteger(num)) {
                outputList.add((int) num);
            }
            idx++;
        }
        return outputList;
    }

    private static List<Integer> findIntegerAsQueueList(List<? extends Number> sourceList) {
        List<Integer> outputList = new ArrayList<>();
        Queue<? extends Number> sourceQueue = new LinkedList<>(sourceList);
        while (!sourceQueue.isEmpty()) {
            Number num = sourceQueue.poll();
            if (isObjectInteger(num)) {
                outputList.add((Integer) num);
            }
        }
        return outputList;
    }

    private static boolean isObjectInteger(Object o) {
        return o instanceof Integer;
    }
}
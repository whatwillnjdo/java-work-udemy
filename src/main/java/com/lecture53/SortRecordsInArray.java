package com.lecture53;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public final class SortRecordsInArray {
    public int[] sortsRecordsWithoutStream(int[] numbersarray) {
        int[] sortedarray = new int[numbersarray.length];
        for (int i = 0; i < numbersarray.length; i++) {
            sortedarray[i] = numbersarray[i];
        }
        boolean isgreater = true;
        int currentmin;
        while (isgreater) {
            isgreater = false;
            for (int i = 0; i < sortedarray.length - 1; i++) {
                if (sortedarray[i] < sortedarray[i + 1]) {
                    currentmin = sortedarray[i];
                    sortedarray[i] = sortedarray[i + 1];
                    sortedarray[i + 1] = currentmin;
                    isgreater = true;
                }
            }
        }
        return sortedarray;
    }


    public List<Integer> sortsRecordsWithStream(List<Integer> numbersarray) {
        return numbersarray.stream().sorted(Comparator.reverseOrder()).collect(toList());
    }
}

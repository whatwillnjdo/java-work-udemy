package com.lecture53;

import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;

public final class SortRecordsInArrayTest {
    @Test
    public void ShouldSortRecordsInAArrayInDescendingOrder() {
        SortRecordsInArray recordsInArray = new SortRecordsInArray();
        int[] numbersarray = {23, 45, 1, 18, 7};
        int[] actual = recordsInArray.sortsRecordsWithoutStream(numbersarray);
        int[] expected = {45, 23, 18, 7, 1};
        assertThat(actual, Is.is(expected));
    }

    @Test
    public void ShouldSortRecordsInAArrayInDescendingOrderUsingStreams() {
        SortRecordsInArray recordsInArray = new SortRecordsInArray();
        List<Integer> numbersarray = asList(23, 45, 1, 18, 7);
        List<Integer> actual = recordsInArray.sortsRecordsWithStream(numbersarray);
        List<Integer> expected = asList(45, 23, 18, 7, 1);
        assertThat(actual, Is.is(expected));
    }
}

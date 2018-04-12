package com.zz.otherclasses;

import junit.framework.TestCase;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;


import java.util.List;

import static java.util.Arrays.asList;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertSame;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.*;

public final class LoopUserInputTest {

    private ClassToHoldMethods calculator;
    @Before
    public void init(){
        calculator = new ClassToHoldMethods();
    }

    @Test
    public void shouldReturnValuesInArray() throws Exception {
        final int[] a  = {1,2,5,6};
        for(final int i:a){
            assertThat(a[3], is(6));
        }
    }

    @Test
    public void ShouldReturnZeroWhenNoRecordsEntered() throws Exception {
        TestCase.assertEquals(calculator.calculate(""), 0);
    }

    @Test
    public void ShouldReturnOneNumberWhenOneNumberEntered() throws Exception {
        TestCase.assertEquals(calculator.calculate("5"), 5);
    }

    @Test
    public void ShouldReturnSumForTwoCommaDelimitedNumbers() throws Exception {
        TestCase.assertEquals(calculator.calculate("3,4"), 7);
    }

    @Test
    public void ShouldReturnSumForNewLineDelimitedNumbers() throws Exception {
        TestCase.assertEquals(calculator.calculate("3\n4"), 7);
    }

    @Test
    public void ShouldReturnSumForThreeCommaDelimitedNumbers() throws Exception {
        TestCase.assertEquals(calculator.calculate("1,2,3"), 6);
    }

    @Test(expected = Exception.class)
    public void ShouldThrowExceptionWhenNegativeNumberEntered() throws Exception {
        calculator.calculate("-1");
    }

    @Test
    public void ShouldIgnoreNumbersGreaterThanThousand() throws Exception {
        TestCase.assertEquals(calculator.calculate("10,10,1001"), 20);
    }

    @Test
    public void ShouldMakeRecordsInCollectionReturnUpperCase() throws Exception {

        List<String> actual = asList("Never","give","up","never","ever","give","up");
        List<String> expected = asList("NEVER","GIVE","UP","NEVER","EVER", "GIVE", "UP");
        MatcherAssert.assertThat(calculator.transformToUpper(actual), is(expected));
    }

    @Test
    public void ShouldReturnUpperCaseRecordsUsingStreams() throws Exception {
        List<String> actual = asList("the","race","to","the","top","of","the","mountain","is","on");
        List<String> expected = asList("THE","RACE","TO","THE","TOP","OF","THE","MOUNTAIN","IS","ON");
        MatcherAssert.assertThat(calculator.transformToUpperCaseUsingStreams(actual), is(expected));
    }

    @Test
    public void ShouldReturnOnlyRecordsLessThanFourCharacters() throws Exception {
        List<String> actual = asList("this","who","valid","data","dat");
        List<String> expected = asList("WHO","DAT");
        MatcherAssert.assertThat(calculator.transformWhoDat(actual), is(expected));
    }

    @Test
    public void ShouldReturnOnlyRecordsGreaterThanFive() throws Exception {
        List<Integer> actual = asList(1,2,3,4,5,6,7,8,9,0);
        List<Integer> expected = asList(6,7,8,9);
        MatcherAssert.assertThat(calculator.methodToGetOnlyRecordsGreaterThanFive(actual), is(expected));
    }

    @Test
    public void ShouldFlattenMultiDimensionalCollection() throws Exception {
        List<List<String>> actual = asList(asList("Guess","who","is", "here"), asList("kiaan","prasher", "mattathil"));
        List<String> expected = asList("GUESS","WHO","IS", "HERE", "KIAAN", "PRASHER", "MATTATHIL");
        MatcherAssert.assertThat(calculator.transformMultiDimensionCollection(actual), is(expected));
    }

    @Test
    public void ShouldReturnSumOfRecords() throws Exception {
        List<Integer> actual = asList(3,4,5);
        int expected = 12;
        MatcherAssert.assertThat(calculator.sumOfRecords(actual), is(expected));
    }


}

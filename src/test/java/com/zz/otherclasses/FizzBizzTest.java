package com.zz.otherclasses;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public final class FizzBizzTest {
    @Test(expected = IllegalArgumentException.class)
    public void ShouldTrowExceptionWhenNoRecordsEntered() throws Exception {
        FizzBizz.someMethod(Integer.parseInt(""));
    }

    @Test
    public void ShouldReturnFizzWhenDivisibleByThree() throws Exception {
        Assert.assertEquals("Fizz", FizzBizz.someMethod(3));
        Assert.assertEquals("Fizz", FizzBizz.someMethod(6));
    }

    @Test
    public void ShouldReturnBizzWhenDivisibleByFive() throws Exception {
        Assert.assertEquals("Bizz", FizzBizz.someMethod(5));
        Assert.assertEquals("Bizz", FizzBizz.someMethod(10));
    }

    @Test
    public void ShouldReturnFizzBizzWhenDivisibleByFifteen() throws Exception {
        Assert.assertEquals("com.zz.otherclasses.FizzBizz", FizzBizz.someMethod(15));
    }

    @Test
    public void ShouldReturnSameNumberIfNotDivisible() throws Exception {
        Assert.assertEquals("2", FizzBizz.someMethod(2));
        Assert.assertEquals("7", FizzBizz.someMethod(7));
    }
}

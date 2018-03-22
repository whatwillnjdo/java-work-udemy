import org.junit.Test;

import static org.junit.Assert.assertEquals;

public final class FizzBizzTest {
    @Test(expected = IllegalArgumentException.class)
    public void ShouldTrowExceptionWhenNoRecordsEntered() throws Exception {
        FizzBizz.someMethod(Integer.parseInt(""));
    }

    @Test
    public void ShouldReturnFizzWhenDivisibleByThree() throws Exception {
        assertEquals("Fizz", FizzBizz.someMethod(3));
        assertEquals("Fizz", FizzBizz.someMethod(6));
    }

    @Test
    public void ShouldReturnBizzWhenDivisibleByFive() throws Exception {
        assertEquals("Bizz", FizzBizz.someMethod(5));
        assertEquals("Bizz", FizzBizz.someMethod(10));
    }

    @Test
    public void ShouldReturnFizzBizzWhenDivisibleByFifteen() throws Exception {
        assertEquals("FizzBizz", FizzBizz.someMethod(15));
    }

    @Test
    public void ShouldReturnSameNumberIfNotDivisible() throws Exception {
        assertEquals("2", FizzBizz.someMethod(2));
        assertEquals("7", FizzBizz.someMethod(7));
    }
}

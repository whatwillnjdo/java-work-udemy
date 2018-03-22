import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public final class FeetInchesToCentimetersTest {

    @Test
    public void FeetParameterShouldBeGreaterThanOrEqualToZero() {
        FeetInchesToCentimeters feetAndInchesToCentimeters = new FeetInchesToCentimeters();
        int actual = (int) feetAndInchesToCentimeters.CalcFeetAndInchesToCentimeters(-2);
        assertThat(actual, Is.is(-1));
    }

    @Test
    public void InchesParameterShouldBeGreaterThanOrEqualToZero() {
        FeetInchesToCentimeters feetAndInchesToCentimeters = new FeetInchesToCentimeters();
        int actual = (int) feetAndInchesToCentimeters.CalcFeetAndInchesToCentimeters(2, -2);
        assertThat(actual, Is.is(-1));
    }

    @Test
    public void InchesParameterShouldNotBeGreaterThanTwelve() {
        FeetInchesToCentimeters feetAndInchesToCentimeters = new FeetInchesToCentimeters();
        int actual = (int) feetAndInchesToCentimeters.CalcFeetAndInchesToCentimeters(2, 14);
        assertThat(actual, Is.is(-1));
    }

    @Test
    public void ShouldConvertFeetAndInchesToCentimeter() {
        FeetInchesToCentimeters feetInchesToCentimeters = new FeetInchesToCentimeters();
        double actual = feetInchesToCentimeters.CalcFeetAndInchesToCentimeters(6, 0);
        assertThat(actual, Is.is(182.88));
    }

    @Test
    public void ShouldConvertInchesToCentimeter() {
        FeetInchesToCentimeters feetInchesToCentimeters = new FeetInchesToCentimeters();
        double actual = feetInchesToCentimeters.CalcFeetAndInchesToCentimeters(100);
        assertThat(actual, Is.is(254.0));
    }
}

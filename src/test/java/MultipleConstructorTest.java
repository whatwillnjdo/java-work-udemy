import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public final class MultipleConstructorTest {
    @Test
    public void ShouldCallAConstructorWithAllParameters() {
        MultipleConstructor multipleConstructor = new MultipleConstructor("NJ", 2500D, "nj@email.com");
        assertThat(multipleConstructor.getName(), Is.is("NJ"));
        assertThat(multipleConstructor.emailaddress, Is.is("nj@email.com"));
        assertThat(multipleConstructor.creditlimit, Is.is(2500D));
    }

    @Test
    public void ShouldCallAConstructorWithPartialParameters() {
        MultipleConstructor multipleConstructor = new MultipleConstructor("NJ", "nj@email.com");
        assertThat(multipleConstructor.name, Is.is("NJ"));
        assertThat(multipleConstructor.emailaddress, Is.is("nj@email.com"));
        assertThat(multipleConstructor.creditlimit, Is.is(1000D));
    }

    @Test
    public void ShouldCallAConstructorWithNoParameters() {
        MultipleConstructor multipleConstructor = new MultipleConstructor();
        assertThat(multipleConstructor.name, Is.is("Default"));
        assertThat(multipleConstructor.getCreditLimit(), Is.is(100D));
        assertThat(multipleConstructor.getEmailAddress(), Is.is("noemail@email.com"));
    }
}

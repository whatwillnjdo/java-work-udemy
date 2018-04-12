package com.zz.otherclasses;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public final class PersonTest {
    @Test
    public void ShouldReturnOldestPerson() throws Exception {
        final Person kiaan = new Person("Kiaan", 2);
        final Person nunu = new Person("Nunu", 32);
        final Person nimby = new Person("Nimby", 35);
        List<Person> actual = asList(kiaan, nunu, nimby);
        MatcherAssert.assertThat(Person.getOldestPerson(actual), Is.is(nimby));
    }
}

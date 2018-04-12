package com.lecture50.oopmaster;

import org.hamcrest.core.Is;
import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;

public final class HamBurgerTest {
    @Test
    public void ShouldBeAbleToCreateABaseHamBurger() {
        HamBurger hamBurger = new HamBurger("Wheat", "Turkey", 10.99, "BaseBurger");
        assertThat(hamBurger.getRollType(), Is.is("Wheat"));
        assertThat(hamBurger.getMeat(), Is.is("Turkey"));
        assertThat(hamBurger.getPrice(), Is.is(10.99));
        assertThat(hamBurger.getTypeOfBurger(), Is.is("BaseBurger"));
    }

    @Test
    public void ShouldBeAbleToAddUptoFourToppingsToTheBaseBurger() throws IllegalAccessException {
        HamBurger hamBurger = new HamBurger("Wheat", "Turkey", 10.99, "BaseBurger");
        double actualbaseburgerprice = hamBurger.baseBurger(asList("Lettuce", "tomato", "Guac"));
        assertThat(actualbaseburgerprice, Is.is(13.96));
    }

    @Test (expected = IllegalArgumentException.class)
    public void ShouldThrowAnExceptionIfMoreThanFourToppingsAreAddedToBaseBurger() {
        HamBurger hamBurger = new HamBurger("Wheat", "Ham", 9.99, "BaseBurger");
        hamBurger.baseBurger(asList("Lettuce", "Onion", "Tomatoes", "Pickle", "GUAC"));
    }
}

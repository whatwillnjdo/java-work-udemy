package com.lecture50.oopmaster;

import org.junit.Test;

import static java.util.Arrays.asList;

public final class HealthyBurgerTest {
    @Test
    public void ShouldBeAbleToCreateAHealthyBurger() {
        HealthyBurger healthyBurger = new HealthyBurger("Wheat", "Turkey", 8.99, "HealthyBurger");
        healthyBurger.baseBurger(asList("GUAC", "Onions", "Tomatoes", "topping4", "topping5", "topping6"));
    }
}

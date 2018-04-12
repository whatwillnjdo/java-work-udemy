package com.lecture50.oopmaster;

import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public final class HealthyBurger  extends HamBurger{

    public HealthyBurger(final String rollType, String meat, double price, final String typeOfBurger) {
        super("BrownRye", meat, price, "HealthyBurger");
    }

    @Override
    public double baseBurger(List<String> toppings) {
        int numberoftopping = toppings.size();
        if (numberoftopping > 6) {
            throw new  IllegalArgumentException("Cannot add more than 6 toppings");
        }
        return getPrice() + (numberoftopping * .99);
    }
}

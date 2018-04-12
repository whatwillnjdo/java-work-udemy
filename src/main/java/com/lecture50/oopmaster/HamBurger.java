package com.lecture50.oopmaster;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HamBurger {

    private String rollType;
    private String meat;
    private double price;
    private String typeOfBurger;


    public double baseBurger(List<String> topping) {
        int numberoftopping = topping.size();
        if ((numberoftopping > 4) && (this.typeOfBurger == "BaseBurger")) {
            throw new IllegalArgumentException("Cannot add more than 4 toppings on this choice of burger");
        }
        return getPrice() + (numberoftopping * .99);
    }
}

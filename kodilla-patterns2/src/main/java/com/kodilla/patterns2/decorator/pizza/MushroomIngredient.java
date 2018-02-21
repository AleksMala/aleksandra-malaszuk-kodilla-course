package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MushroomIngredient extends AbstractPizzaDecorator {
    public MushroomIngredient(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with mushrooms ";
    }
}

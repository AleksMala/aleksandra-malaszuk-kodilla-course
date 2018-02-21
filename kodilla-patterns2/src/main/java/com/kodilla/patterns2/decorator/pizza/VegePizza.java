package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class VegePizza extends AbstractPizzaDecorator {
    public VegePizza(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(15));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with broccoli, dried tomatoes, pecans, artichoke, olives";
    }
}

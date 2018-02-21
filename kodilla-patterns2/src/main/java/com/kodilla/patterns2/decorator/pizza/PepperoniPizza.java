package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PepperoniPizza extends AbstractPizzaDecorator {
    public PepperoniPizza(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(7));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with onion and pepperoni";
    }
}

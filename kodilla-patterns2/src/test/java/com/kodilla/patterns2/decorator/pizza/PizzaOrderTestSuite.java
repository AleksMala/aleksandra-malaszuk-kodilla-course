package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), theCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        //When
        //Then
        assertEquals("Pizza with cheese & souce", pizzaOrder.getDescription());
    }

    @Test
    public void testHawaiianPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new HawaiianPizza(pizzaOrder);
        //When
        //Then
        assertEquals(new BigDecimal(35), pizzaOrder.getCost());
    }

    @Test
    public void testHawaiianPizzaOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new HawaiianPizza(pizzaOrder);
        //When
        //Then
        assertEquals("Pizza with cheese & souce with pineapple, ham, corn, tuna", pizzaOrder.getDescription());
    }

    @Test
    public void testPepperonniPizzaWithExtraCheeseOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new PepperoniPizza(pizzaOrder);
        pizzaOrder = new ChickenIngredient(pizzaOrder);
        pizzaOrder = new ExtraCheese(pizzaOrder);
        //When
        //Then
        assertEquals(new BigDecimal(32), pizzaOrder.getCost());
    }

    @Test
    public void testVegePizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new VegePizza(pizzaOrder);
        pizzaOrder = new MushroomIngredient(pizzaOrder);
        //When
        //Then
        assertEquals(new BigDecimal(34), pizzaOrder.getCost());
    }

    @Test
    public void testVegePizzaOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new VegePizza(pizzaOrder);
        pizzaOrder = new MushroomIngredient(pizzaOrder);
        //When
        //Then
        assertEquals("Pizza with cheese & souce with broccoli, dried tomatoes, pecans, artichoke, olives with mushrooms ", pizzaOrder.getDescription());
    }

    @Test
    public void testExtraCheesePizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new ExtraCheese(pizzaOrder);
        //When
        //Then
        assertEquals(new BigDecimal(20), pizzaOrder.getCost());
    }

    @Test
    public void testExtraCheesePizzaOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new ExtraCheese(pizzaOrder);
        //When
        //Then
        assertEquals("Pizza with cheese & souce + extra cheese", pizzaOrder.getDescription());
    }
}

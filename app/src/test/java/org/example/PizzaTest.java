package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {
    @Test 
    void testPizza() {
        Pizza pizza = new Pizza.Builder(12)
            .cheese()
            .pepperoni()
            .bacon()
            .build();
        assertEquals("Pizza{size=12, cheese=true, pepperoni=true, bacon=true}", pizza.toString());
    }

    @Test
    void testPizzaWithSizeOnly() {
        Pizza pizza = new Pizza.Builder(12)
            .build();
        assertEquals("Pizza{size=12, cheese=false, pepperoni=false, bacon=false}", pizza.toString());
    }

    @Test
    void testPizzaWithSizeAndCheese() {
        Pizza pizza = new Pizza.Builder(12)
            .cheese()
            .build();
        assertEquals("Pizza{size=12, cheese=true, pepperoni=false, bacon=false}", pizza.toString());
    }

    @Test
    void testPizzaWithSizeCheeseAndPepperoni() {
        Pizza pizza = new Pizza.Builder(12)
            .cheese()
            .pepperoni()
            .build();
        assertEquals("Pizza{size=12, cheese=true, pepperoni=true, bacon=false}", pizza.toString());
    }
}

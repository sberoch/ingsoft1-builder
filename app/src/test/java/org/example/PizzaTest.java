package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {
    @Test 
    void testPizza() {
        Pizza pizza = new Pizza(12, true, true, true);
        assertEquals("Pizza{size=12, cheese=true, pepperoni=true, bacon=true}", pizza.toString());
    }
}

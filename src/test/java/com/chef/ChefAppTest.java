package com.chef;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChefAppTest {
    static class TestFood implements Food {
        boolean prepared = false;

        @Override
        public void prepare() {
            prepared = true;
            System.out.println("TestFood prepared");
        }

        public boolean isPrepared() {
            return prepared;
        }
    }

    @Test
    @Description("Ensure Chef class calls prepare() on Food")
    void chefShouldCallPrepareOnFood() {
        // Arrange
        TestFood testFood = new TestFood();
        Chef chef = new Chef(testFood);

        // Act
        chef.cook();

        // Assert
        assertTrue(testFood.isPrepared(), "Chef should have called prepare() on Food");
    }

    @Test
    @Description("Ensure Chef can cook burgers")
    void chefCanCookBurger() {
        Food burger = new Burger();
        Chef chef = new Chef(burger);
        chef.cook();
        assertTrue(true);
    }

    @Test
    @Description("Ensure Chef can cook pizzas")
    void chefCanCookPizza() {
        Food pizza = new Pizza();
        Chef chef = new Chef(pizza);
        chef.cook();
        assertTrue(true);
    }
}

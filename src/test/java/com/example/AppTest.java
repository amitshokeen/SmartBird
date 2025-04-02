package com.example;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    @Description("Ensure SmartBird's proper behavior")
    void smartBirdShouldBehaveCorrectly() {
        SmartBird bird = new SmartBird();

        // Check polymorphism
        assertTrue(bird instanceof Animal);
        assertTrue(bird instanceof Flyable);
        assertTrue(bird instanceof Singable);
    }
}

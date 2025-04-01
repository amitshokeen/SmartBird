package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void smartBirdShouldBehaveCorrectly() {
        SmartBird bird = new SmartBird();

        // Check polymorphism
        assertTrue(bird instanceof Animal);
        assertTrue(bird instanceof Flyable);
        assertTrue(bird instanceof Singable);
    }
}

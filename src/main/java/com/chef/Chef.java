package com.chef;

public class Chef {
    private final Food food;

    public Chef(Food food) {
        this.food = food;
    }

    public void cook() {
        System.out.println("Chef is cooking...");
        food.prepare();
    }
}

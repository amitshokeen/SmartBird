package com.example;

public class SmartBird extends Animal implements Flyable, Singable {

    @Override
    public void makeSound() {
        System.out.println("Chirp chirp!");
    }

    @Override
    public void fly() {
        System.out.println("SmartBird is flying high!");
    }

    @Override
    public void sing() {
        System.out.println("SmartBird is singing a melody!");
    }
}

package com.example;

public class App
{
    public static void main( String[] args )
    {
        SmartBird bird = new SmartBird();

        bird.eat();         // inherited from Animal
        bird.makeSound();   // overridden method
        bird.fly();         // from Flyable
        bird.sing();        // from Singable
    }
}

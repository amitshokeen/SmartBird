package com.chef;

public class App {
    public static void main(String[] args){
        Chef burgerChef = new Chef(new Burger());
        burgerChef.cook();

        Chef pizzaChef = new Chef(new Pizza());
        pizzaChef.cook();
    }
;}

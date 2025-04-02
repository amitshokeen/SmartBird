package com.chef;

public class Burger implements Food{
    @Override
    public void prepare(){
        System.out.println("Grilling a juicy burger 🍔");
    }
}

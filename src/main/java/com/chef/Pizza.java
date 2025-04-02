package com.chef;

public class Pizza implements Food{
    @Override
    public void prepare(){
        System.out.println("Baking a cheesy pizza 🍕");
    }
}

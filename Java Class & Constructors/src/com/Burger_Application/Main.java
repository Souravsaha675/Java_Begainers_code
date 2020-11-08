package com.Burger_Application;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger=new Hamburger("Basic","Sausage",7.50,"white");
        double price= hamburger.customHamburger();
        hamburger.addHamburgerAddition1("Tomato",0.25);
        hamburger.addHamburgerAddition2("Lettuce",0.50);
        hamburger.addHamburgerAddition3("Cheese",0.75);
        System.out.println("Total Burger price is "+hamburger.customHamburger());

        HealthyBurger healthyBurger= new HealthyBurger("Bacon",4.50);
        healthyBurger.addHamburgerAddition1("Egg",3.50);
        healthyBurger.addHealthyAddition1("Lentils",3.50);
        System.out.println("Total Healthy Burger price is "+healthyBurger.customHamburger());

        DeluxBurger deluxBurger = new DeluxBurger();
        deluxBurger.addHamburgerAddition3("Should not do this ",50.50);
        deluxBurger.customHamburger();
    }
}

package com.Burger_Application;

public class DeluxBurger extends Hamburger {
    public DeluxBurger(){
        super("Delux","Sausage & Bacon",15.50,"White");
        super.addHamburgerAddition1("Chips",3.50);
        super.addHamburgerAddition2("Drink",5.50);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional item to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional item to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional item to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional item to a deluxe burger");
    }
}
